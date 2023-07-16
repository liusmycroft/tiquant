package com.lius.tiquant.facade.common.dto.api.response.open;

import java.util.List;

import com.lius.tiquant.facade.common.dto.SimpleStrategyDTO;
import com.lius.tiquant.facade.common.dto.api.BaseListResponseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ListStrategyResponseDTO extends BaseListResponseDTO {
  private List<SimpleStrategyDTO> strategies;


}
