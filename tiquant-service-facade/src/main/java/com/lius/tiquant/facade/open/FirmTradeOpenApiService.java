package com.lius.tiquant.facade.open;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.CreateAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.GetFirmTradeRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.ListFirmTradeRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.UpdateFirmTradeRequestDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.GetFirmTradeResponseDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.ListFirmTradeResponseDTO;

public interface FirmTradeOpenApiService {

  BaseResponseDTO createFirmTrade(CreateAccountRequestDTO createAccountRequestDTO);

  GetFirmTradeResponseDTO describeFirmTrade(GetFirmTradeRequestDTO getFirmTradeRequestDTO);

  ListFirmTradeResponseDTO listFirmTrade(ListFirmTradeRequestDTO listFirmTradeRequestDTO);

  BaseRequestDTO modifyFirmTrade(UpdateFirmTradeRequestDTO updateFirmTradeRequestDTO);
}
