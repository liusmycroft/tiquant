package com.lius.tiquant.service.backtest.impl;

import java.util.List;

import com.lius.tiquant.common.enums.SubscriptionType;
import com.lius.tiquant.facade.common.dto.BackTestDTO;
import com.lius.tiquant.facade.common.enums.BackTestStatus;
import com.lius.tiquant.service.backtest.BackTestManager;
import com.lius.tiquant.service.backtest.BackTestService;
import com.lius.tiquant.service.backtest.model.BackTest;
import com.lius.tiquant.service.container.ContainerManager;
import com.lius.tiquant.service.container.model.Container;
import com.lius.tiquant.service.strategy.StrategyManager;
import com.lius.tiquant.service.strategy.model.Strategy;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class BackTestServiceImpl implements BackTestService {

  private BackTestManager backTestManager;

  private ContainerManager containerManager;

  private StrategyManager strategyManager;

  @Override
  public void createBackTest(BackTest backTest) {
    backTestManager.saveBackTest(backTest);
  }

  @Override
  public void runBackTest(String backTestId) {
    BackTest backTest = backTestManager.getBackTest(backTestId);
    if (backTest.getBackTestStatus().equals(BackTestStatus.RUNNING)) {
      throw new RuntimeException();
    }
    String strategyId = backTest.getStrategyId();
    Strategy strategy = strategyManager.getStrategy(strategyId);
    Container container = containerManager.createInstance(backTest.getAccountId(), strategy.getContent(), SubscriptionType.MOCK);
    container.run();
    backTest.setBackTestStatus(BackTestStatus.RUNNING);
    backTestManager.updateBackTest(backTest);
  }

  @Override
  public void stopBackTest(String backTestId) {

  }

  @Override
  public void describeBackTest(String backTestId) {

  }

  @Override
  public List<BackTestDTO> listBackTest() {
    return null;
  }

  @Override
  public void modifyBackTest(BackTest backTest) {

  }
}
