package com.lius.tiquant.service.backtest;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.CreateAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.GetBackTestRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.ListBackTestRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.UpdateBackTestRequestDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.GetBackTestResponseDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.ListBackTestResponseDTO;
import com.lius.tiquant.facade.open.BackTestOpenApiService;
import com.lius.tiquant.service.backtest.manager.BackTestManager;
import io.vertx.core.AbstractVerticle;

public class BackTestOpenApiServiceImpl extends AbstractVerticle implements BackTestOpenApiService {

  private BackTestManager backTestManager;

  @Override
  public BaseResponseDTO createBackTest(CreateAccountRequestDTO createAccountRequestDTO) {
    return null;
  }

  @Override
  public GetBackTestResponseDTO describeBackTest(GetBackTestRequestDTO getBackTestRequestDTO) {
    return null;
  }

  @Override
  public ListBackTestResponseDTO listBackTest(ListBackTestRequestDTO listBackTestRequestDTO) {
    return null;
  }

  @Override
  public BaseRequestDTO modifyBackTest(UpdateBackTestRequestDTO updateBackTestRequestDTO) {
    return null;
  }
}
