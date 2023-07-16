package com.lius.tiquant.service.container;

import com.lius.tiquant.common.enums.SubscriptionType;
import com.lius.tiquant.service.container.model.Container;
import com.lius.tiquant.service.strategy.model.Strategy;

public interface ContainerManager {
  Container createInstance(String userId, String code, SubscriptionType subscriptionType);
}
