package com.lius.tiquant.service.strategy.manager;

import com.lius.tiquant.service.strategy.model.Strategy;

public interface StrategyManager {
  void checkStrategyExists(String strategyId);

  Strategy getStrategy(String strategyId);
}
