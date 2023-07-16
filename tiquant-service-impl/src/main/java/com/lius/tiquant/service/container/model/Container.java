package com.lius.tiquant.service.biz.container.model;

import javax.print.Doc;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.lius.tiquant.common.util.DockerClientUtil;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Container {

  private String code;
  private String instanceId;
  private DockerClient dockerClient;

  public void run() {
    // 创建docker容器
    CreateContainerResponse response = DockerClientUtil.createContainer(dockerClient, "i-xxx", "image-xxx");

    // 拷贝代码和依赖库到容器内，cp xxx xxx
    // 然后docker run xxx /bin/bash -c "python src/main.py"
    // 向数据中心注册监听，告诉数据中心自己需要xx股票的数据，数据到达后调用，数据中心调用该container的tick方法
    // 数据中心会接受容器的请求，并返回数据，比如getBar

  }

  // 向docker发送数据，驱动策略向前运行
  public void tick() {

  }

  public void stop() {
    // 向数据中心暂停监听
  }

  public void destroy() {
    // 向数据中心注销监听
    // 销毁docker容器
  }
}
