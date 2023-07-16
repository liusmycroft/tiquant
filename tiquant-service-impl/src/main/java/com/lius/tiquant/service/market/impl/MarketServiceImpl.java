package com.lius.tiquant.service.market.impl;

import java.util.Map;
import java.util.Set;

import com.lius.tiquant.common.enums.SubscriptionType;
import com.lius.tiquant.service.container.model.Container;
import com.lius.tiquant.service.market.MarketService;

public class MarketServiceImpl implements MarketService {


  private Set<Container> realTimeSubscription;

  private Map<String, Container> mockSubscription;

  @Override
  public void addSubscription(Container container) {

    // 注册到map+存储到db

    // 查看订阅的类型
    // 1、实时订阅
    // 2、历史订阅，此处需要启动任务获取历史数据，比如投递一条消息到mq中，其他服务会将数据投递到HistoryListener
    // 3、随机模拟订阅
    if (container.getSubscriptionType() == SubscriptionType.REAL_TIME) {
      realTimeSubscription.add(container);
    } else if (container.getSubscriptionType() == SubscriptionType.MOCK) {
      mockSubscription.put("test", container);
    }
  }

  private void updateRealTimeBar() {
    // 过滤订阅股票/期权的实时行情消息
    // 反应到内存
    // 存储到数据库
    // 轮询map，如果该tick，则tick container
  }

  private void updateHistoryBar() {
    // 更新特定历史行情数据的bar
  }

  @Override
  public void startSubscription(Container container) {

  }

  @Override
  public void stopSubscription() {

  }

  @Override
  public void removeSubscription() {

  }

  @Override
  public void listSubscription() {

  }

  @Override
  public void getSubscription() {

  }
}
