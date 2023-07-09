package com.lius.tiquant.service.account;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.CreateAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.GetAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.ListAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.UpdateAccountRequestDTO;
import com.lius.tiquant.facade.open.AccountOpenApiService;
import io.vertx.core.AbstractVerticle;

public class AccountOpenApiServiceImpl extends AbstractVerticle implements AccountOpenApiService {



  @Override
  public BaseResponseDTO createAccount(CreateAccountRequestDTO createAccountRequestDTO) {
    return null;
  }

  @Override
  public GetAccountRequestDTO describeAccount(GetAccountRequestDTO getAccountRequestDTO) {
    return null;
  }

  @Override
  public ListAccountRequestDTO listAccount(ListAccountRequestDTO listAccountRequestDTO) {
    return null;
  }

  @Override
  public BaseRequestDTO modifyAccount(UpdateAccountRequestDTO updateAccountRequestDTO) {
    return null;
  }
}
