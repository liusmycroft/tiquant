package com.lius.tiquant.service.api.open.dubbo;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.CreateAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.GetFirmTradeRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.ListFirmTradeRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.UpdateFirmTradeRequestDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.GetFirmTradeResponseDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.ListFirmTradeResponseDTO;
import com.lius.tiquant.facade.api.open.FirmTradeOpenApiApplication;

public class FirmTradeOpenApiApplicationImpl implements FirmTradeOpenApiApplication {
  @Override
  public BaseResponseDTO createFirmTrade(CreateAccountRequestDTO createAccountRequestDTO) {
    return null;
  }

  @Override
  public GetFirmTradeResponseDTO describeFirmTrade(GetFirmTradeRequestDTO getFirmTradeRequestDTO) {
    return null;
  }

  @Override
  public ListFirmTradeResponseDTO listFirmTrade(ListFirmTradeRequestDTO listFirmTradeRequestDTO) {
    return null;
  }

  @Override
  public BaseRequestDTO modifyFirmTrade(UpdateFirmTradeRequestDTO updateFirmTradeRequestDTO) {
    return null;
  }
}
