package com.lius.tiquant.service.backtest;

import com.lius.tiquant.service.backtest.model.BackTest;

public interface BackTestManager {
  void saveBackTest(BackTest backTest);

  BackTest getBackTest(String backTestId);

  void updateBackTest(BackTest backTest);

}
