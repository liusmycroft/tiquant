package com.lius.tiquant.facade.common.dto.api.response.open;

import java.util.List;

import com.lius.tiquant.facade.common.dto.InstrumentDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ListInstrumentResponseDTO extends BaseResponseDTO {
  private List<InstrumentDTO> instruments;
}
