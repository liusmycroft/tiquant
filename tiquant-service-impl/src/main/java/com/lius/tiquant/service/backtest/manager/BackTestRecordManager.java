package com.lius.tiquant.service.biz.backtest.manager;

import com.lius.tiquant.service.biz.backtest.model.BackTestRecord;

import java.util.List;

public interface BackTestRecordManager {
  List<BackTestRecord> listBackTestRecord(String backTestId);
}
