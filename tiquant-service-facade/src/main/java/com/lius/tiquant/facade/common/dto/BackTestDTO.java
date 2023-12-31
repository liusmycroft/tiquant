package com.lius.tiquant.facade.common.dto;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BackTestDTO {
  private String id;
  private String name;
  private String strategyId;
  private String accountId;
  private Date startTime;
  private Date endTime;
  private List<BackTestRecordDTO> backTestRecords;
}
