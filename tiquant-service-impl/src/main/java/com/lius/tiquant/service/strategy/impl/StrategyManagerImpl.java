package com.lius.tiquant.service.strategy.impl;

import com.lius.tiquant.common.util.RepoUtil;
import com.lius.tiquant.service.strategy.StrategyManager;
import com.lius.tiquant.service.strategy.model.Strategy;
import io.vertx.sqlclient.Tuple;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
public class StrategyManagerImpl implements StrategyManager {

  private RepoUtil repoUtil;

  @Override
  public void checkStrategyExists(String strategyId) {

  }

  @Override
  public Strategy getStrategy(String strategyId) {
    return null;
  }

  @Override
  public void createStrategy(Strategy strategy) {

    repoUtil.executeNoResult(
      Tuple.of(strategy.getAuthor(), strategy.getContent()),
      "INSERT INTO strategy (gmt_create, gmt_modified, author, content) VALUES ($1, $2, $3, $4)",
      null
    );
  }
}
