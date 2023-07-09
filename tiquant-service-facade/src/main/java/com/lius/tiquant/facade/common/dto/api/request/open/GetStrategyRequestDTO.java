package com.lius.tiquant.facade.common.dto.api.request.open;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GetStrategyRequestDTO extends BaseRequestDTO {
  private String strategyId;
}
