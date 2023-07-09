package com.lius.tiquant.facade.common.dto.api.request.open;

import java.util.Date;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CreateBackTestRequestDTO extends BaseRequestDTO {
  private String name;
  private String strategyId;
  private String accountId;
  private Date startTime;
  private Date endTime;
}
