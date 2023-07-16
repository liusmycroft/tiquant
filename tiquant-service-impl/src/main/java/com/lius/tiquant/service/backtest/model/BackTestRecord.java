package com.lius.tiquant.service.backtest.model;

import com.lius.tiquant.facade.common.dto.BackTestRecordDTO;

public class BackTestRecord {
  private String id;
  private String backTestId;

  public static BackTestRecordDTO dto(BackTestRecord record) {
    return BackTestRecordDTO.builder()
      .recordId(record.id)
      .backTestId(record.backTestId)
      .build();
  }
}
