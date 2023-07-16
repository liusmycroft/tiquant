package com.lius.tiquant.service.container.model;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.lius.tiquant.common.enums.SubscriptionType;
import com.lius.tiquant.common.util.DockerClientUtil;
import com.lius.tiquant.service.market.MarketService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@AllArgsConstructor
@Slf4j
public class Container {

  private String code;
  private String instanceId;
  private DockerClient dockerClient;
  private MarketService marketService;
  private SubscriptionType subscriptionType;

  public void run() {
    // 创建docker容器
    CreateContainerResponse response = DockerClientUtil.createContainer(dockerClient, instanceId, "backTest-standard");
    log.info("{}", response);
    // 拷贝代码和依赖库到容器内，cp xxx xxx
    // 向数据中心注册监听，告诉数据中心自己需要xx股票的数据，数据到达后调用，数据中心调用该container的tick方法
    marketService.addSubscription(this);
    // 然后docker run xxx /bin/bash -c "python src/main.py"
    DockerClientUtil.startContainer(dockerClient, response.getId());
    // 数据中心会接受容器的请求，并返回数据，比如getBar
    marketService.startSubscription(this);
  }

  // 向docker发送数据，驱动策略向前运行
  public void tick() {

  }

  public void stop() {
    // 向数据中心暂停监听
    marketService.stopSubscription();
  }

  public void destroy() {
    // 向数据中心注销监听
    marketService.removeSubscription();
    // 销毁docker容器
  }
}
