package com.lius.tiquant.service.backtest;

import com.lius.tiquant.service.backtest.model.BackTestRecord;

import java.util.List;

public interface BackTestRecordManager {
  List<BackTestRecord> listBackTestRecord(String backTestId);
}
