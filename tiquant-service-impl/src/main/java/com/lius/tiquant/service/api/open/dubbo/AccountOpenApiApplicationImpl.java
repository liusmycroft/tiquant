package com.lius.tiquant.service.api.open.dubbo;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.CreateAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.GetAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.ListAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.UpdateAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.GetAccountResponseDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.ListAccountResponseDTO;
import com.lius.tiquant.facade.api.open.AccountOpenApiApplication;
import io.vertx.core.AbstractVerticle;

public class AccountOpenApiApplicationImpl extends AbstractVerticle implements AccountOpenApiApplication {

  @Override
  public BaseResponseDTO createAccount(CreateAccountRequestDTO createAccountRequestDTO) {
    return null;
  }

  @Override
  public GetAccountResponseDTO describeAccount(GetAccountRequestDTO getAccountRequestDTO) {
    return null;
  }

  @Override
  public ListAccountResponseDTO listAccount(ListAccountRequestDTO listAccountRequestDTO) {
    return null;
  }

  @Override
  public BaseRequestDTO modifyAccount(UpdateAccountRequestDTO updateAccountRequestDTO) {
    return null;
  }
}
