package com.lius.tiquant.facade.common.dto.api.request.open;

import java.util.Date;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.enums.BackTestStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UpdateBackTestRequestDTO extends BaseRequestDTO {
  private String name;
  private String strategyId;
  private String accountId;
  private Date startTime;
  private Date endTime;
  private BackTestStatus backTestStatus;
}
