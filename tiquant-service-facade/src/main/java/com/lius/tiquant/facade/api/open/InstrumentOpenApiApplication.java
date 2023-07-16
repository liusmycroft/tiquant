package com.lius.tiquant.facade.api.open;

import com.lius.tiquant.facade.common.dto.api.request.open.ListInstrumentRequestDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.ListInstrumentResponseDTO;

public interface InstrumentOpenApiApplication {

  ListInstrumentResponseDTO listInstruments(ListInstrumentRequestDTO listInstrumentRequestDTO);
}
