package com.lius.tiquant.facade.common.dto.api.request.open;

import com.lius.tiquant.facade.common.dto.api.BaseListRequestDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ListStrategyRequestDTO extends BaseListRequestDTO {
  private String strategyName;
}
