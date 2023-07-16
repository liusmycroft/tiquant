package com.lius.tiquant.service.backtest;

import java.util.List;

import com.lius.tiquant.facade.common.dto.BackTestDTO;
import com.lius.tiquant.service.backtest.model.BackTest;

public interface BackTestService {
  void createBackTest(BackTest backTest);
  void runBackTest(String backTestId);
  void stopBackTest(String backTestId);
  void describeBackTest(String backTestId);
  List<BackTestDTO> listBackTest();
  void modifyBackTest(BackTest backTest);
}
