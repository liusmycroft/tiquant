package com.lius.tiquant.service.biz.backtest.model;

import com.lius.tiquant.facade.common.enums.BackTestStatus;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class BackTest {
  private String id;
  private String name;
  private String strategyId;
  private String accountId;
  private Date startTime;
  private Date endTime;
  private BackTestStatus backTestStatus;
}
