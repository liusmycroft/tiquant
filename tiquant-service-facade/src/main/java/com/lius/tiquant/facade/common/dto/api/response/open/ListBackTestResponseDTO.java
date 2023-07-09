package com.lius.tiquant.facade.common.dto.api.response.open;

import java.util.List;

import com.lius.tiquant.facade.common.dto.BackTestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseListResponseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ListBackTestResponseDTO extends BaseListResponseDTO {
  private List<BackTestDTO> backTests;
}
