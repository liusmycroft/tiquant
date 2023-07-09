package com.lius.tiquant.facade.open;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.CreateAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.GetAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.ListAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.UpdateAccountRequestDTO;

/**
 * 账号管理服务
 */
public interface AccountOpenApiService {
  BaseResponseDTO createAccount(CreateAccountRequestDTO createAccountRequestDTO);

  GetAccountRequestDTO describeAccount(GetAccountRequestDTO getAccountRequestDTO);

  ListAccountRequestDTO listAccount(ListAccountRequestDTO listAccountRequestDTO);

  BaseRequestDTO modifyAccount(UpdateAccountRequestDTO updateAccountRequestDTO);
}
