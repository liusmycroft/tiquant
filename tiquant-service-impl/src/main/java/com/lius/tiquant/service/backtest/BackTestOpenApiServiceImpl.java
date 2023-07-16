package com.lius.tiquant.service.backtest;

import com.lius.tiquant.facade.common.dto.BackTestDTO;
import com.lius.tiquant.facade.common.dto.BackTestRecordDTO;
import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.*;
import com.lius.tiquant.facade.common.dto.api.response.open.GetBackTestResponseDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.ListBackTestResponseDTO;
import com.lius.tiquant.facade.common.enums.ApiErrorCode;
import com.lius.tiquant.facade.common.enums.BackTestStatus;
import com.lius.tiquant.facade.common.exception.ApiException;
import com.lius.tiquant.facade.open.BackTestOpenApiService;
import com.lius.tiquant.service.account.manager.AccountManager;
import com.lius.tiquant.service.backtest.manager.BackTestManager;
import com.lius.tiquant.service.backtest.manager.BackTestRecordManager;
import com.lius.tiquant.service.backtest.model.BackTest;
import com.lius.tiquant.service.backtest.model.BackTestRecord;
import com.lius.tiquant.service.container.manager.ContainerManager;
import com.lius.tiquant.service.container.model.Container;
import com.lius.tiquant.service.strategy.manager.StrategyManager;
import com.lius.tiquant.service.strategy.model.Strategy;
import io.vertx.core.AbstractVerticle;

import java.util.stream.Collectors;

// todo: 异步改造
public class BackTestOpenApiServiceImpl extends AbstractVerticle implements BackTestOpenApiService {

  private BackTestManager backTestManager;

  private BackTestRecordManager backTestRecordManager;

  private AccountManager accountManager;

  private StrategyManager strategyManager;

  private ContainerManager containerManager;

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
    BackTest backTest = backTestManager.getBackTest(request.getBackTestId());
    if (backTest.getBackTestStatus().equals(BackTestStatus.RUNNING)) {
      return BaseResponseDTO.fail(request.getRequestId(), new ApiException(ApiErrorCode.BACK_TEST_IS_RUNNING,
        backTest.getId()));
    }
    String strategyId = backTest.getStrategyId();
    Strategy strategy = strategyManager.getStrategy(strategyId);
    String content = strategy.getContent();
    Container container = containerManager.createInstance();
    container.setCode(content);
    container.run();
    backTest.setBackTestStatus(BackTestStatus.RUNNING);
    backTestManager.updateBackTest(backTest);
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
