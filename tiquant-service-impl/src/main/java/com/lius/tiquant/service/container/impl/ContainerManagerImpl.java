package com.lius.tiquant.service.container.impl;

import java.util.UUID;

import com.github.dockerjava.api.DockerClient;
import com.lius.tiquant.common.enums.SubscriptionType;
import com.lius.tiquant.service.container.ContainerManager;
import com.lius.tiquant.service.container.model.Container;
import com.lius.tiquant.service.market.MarketService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class ContainerManagerImpl implements ContainerManager {

  private MarketService marketService;

  private DockerClient dockerClient;

  @Override
  public Container createInstance(String userId, String code, SubscriptionType subscriptionType) {
    String instanceId = userId + "-" + UUID.randomUUID();
    return new Container(code, instanceId, dockerClient, marketService, subscriptionType);
  }
}
