package com.lius.tiquant.facade.api.open;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.CreateAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.GetStrategyRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.ListStrategyRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.UpdateStrategyRequestDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.GetStrategyResponseDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.ListStrategyResponseDTO;

public interface StrategyOpenApiApplication {

  BaseResponseDTO createStrategy(CreateAccountRequestDTO createAccountRequestDTO);

  GetStrategyResponseDTO describeStrategy(GetStrategyRequestDTO getStrategyRequestDTO);

  ListStrategyResponseDTO listStrategy(ListStrategyRequestDTO listStrategyRequestDTO);

  BaseRequestDTO modifyStrategy(UpdateStrategyRequestDTO updateStrategyRequestDTO);
}
