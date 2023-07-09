package com.lius.tiquant.facade.common.dto;

import java.util.Date;

import lombok.Data;

@Data
public class BackTestDTO {
  private String id;
  private String name;
  private String strategyId;
  private String accountId;
  private Date startTime;
  private Date endTime;
}
