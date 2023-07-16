package com.lius.tiquant.service.biz.backtest.manager;

import com.lius.tiquant.service.biz.backtest.model.BackTest;

public interface BackTestManager {
  void saveBackTest(BackTest backTest);

  BackTest getBackTest(String backTestId);

  void updateBackTest(BackTest backTest);

}
