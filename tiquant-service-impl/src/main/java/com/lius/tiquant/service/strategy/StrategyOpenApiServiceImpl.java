package com.lius.tiquant.service.strategy;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.CreateAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.GetStrategyRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.ListStrategyRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.UpdateStrategyRequestDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.GetStrategyResponseDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.ListStrategyResponseDTO;
import com.lius.tiquant.facade.open.StrategyOpenApiService;

public class StrategyOpenApiServiceImpl implements StrategyOpenApiService {



  @Override
  public BaseResponseDTO createStrategy(CreateAccountRequestDTO createAccountRequestDTO) {
    return null;
  }

  @Override
  public GetStrategyResponseDTO describeStrategy(GetStrategyRequestDTO getStrategyRequestDTO) {
    return null;
  }

  @Override
  public ListStrategyResponseDTO listStrategy(ListStrategyRequestDTO listStrategyRequestDTO) {
    return null;
  }

  @Override
  public BaseRequestDTO modifyStrategy(UpdateStrategyRequestDTO updateStrategyRequestDTO) {
    return null;
  }
}
