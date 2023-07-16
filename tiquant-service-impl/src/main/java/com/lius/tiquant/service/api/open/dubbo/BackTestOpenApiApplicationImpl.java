package com.lius.tiquant.service.api.open.dubbo;

import com.lius.tiquant.facade.common.dto.BackTestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.*;
import com.lius.tiquant.facade.common.dto.api.response.open.GetBackTestResponseDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.ListBackTestResponseDTO;
import com.lius.tiquant.facade.common.enums.BackTestStatus;
import com.lius.tiquant.facade.api.open.BackTestOpenApiApplication;
import com.lius.tiquant.service.account.AccountManager;
import com.lius.tiquant.service.backtest.BackTestManager;
import com.lius.tiquant.service.backtest.BackTestRecordManager;
import com.lius.tiquant.service.backtest.model.BackTest;
import com.lius.tiquant.service.backtest.model.BackTestRecord;
import com.lius.tiquant.service.strategy.StrategyManager;
import io.vertx.core.AbstractVerticle;

import java.util.stream.Collectors;

// todo: 异步改造
public class BackTestOpenApiApplicationImpl extends AbstractVerticle implements BackTestOpenApiApplication {

  private BackTestManager backTestManager;

  private BackTestRecordManager backTestRecordManager;

  private AccountManager accountManager;

  private StrategyManager strategyManager;

  private void checkParams(String accountId, String strategyId) {
    accountManager.checkAccountExists(accountId);
    strategyManager.checkStrategyExists(strategyId);
  }

  @Override
  public BaseResponseDTO createBackTest(CreateBackTestRequestDTO request) {
    String accountId = request.getAccountId();
    String strategyId = request.getStrategyId();
    checkParams(accountId, strategyId);
    BackTest backTest = BackTest.builder()
      .name(request.getName())
      .strategyId(request.getStrategyId())
      .accountId(accountId)
      .startTime(request.getStartTime())
      .endTime(request.getEndTime())
      .backTestStatus(BackTestStatus.NEVER_START)
      .build();
    backTestManager.saveBackTest(backTest);
    return BaseResponseDTO.ok(request.getRequestId());
  }

  @Override
  public BaseResponseDTO runBackTest(RunBackTestRequestDTO request) {
    return BaseResponseDTO.ok(request.getRequestId());
  }

  @Override
  public GetBackTestResponseDTO describeBackTest(GetBackTestRequestDTO request) {
    String backTestId = request.getBackTestId();
    BackTest backTest = backTestManager.getBackTest(backTestId);
    GetBackTestResponseDTO response = new GetBackTestResponseDTO();
    BackTestDTO backTestDTO = BackTestDTO.builder()
      .id(backTestId)
      .name(backTest.getName())
      .accountId(backTest.getAccountId())
      .strategyId(backTest.getStrategyId())
      .startTime(backTest.getStartTime())
      .endTime(backTest.getEndTime())
      .backTestRecords(backTestRecordManager.listBackTestRecord(backTestId).stream()
        .map(BackTestRecord::dto).collect(Collectors.toList()))
      .build();
    response.setBackTestDTO(backTestDTO);
    return response;
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
