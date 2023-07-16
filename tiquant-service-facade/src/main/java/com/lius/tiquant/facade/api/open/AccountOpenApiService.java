package com.lius.tiquant.facade.api.open;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.CreateAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.GetAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.ListAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.UpdateAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.GetAccountResponseDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.ListAccountResponseDTO;

/**
 * 账号管理服务
 */
public interface AccountOpenApiService {
  BaseResponseDTO createAccount(CreateAccountRequestDTO createAccountRequestDTO);

  GetAccountResponseDTO describeAccount(GetAccountRequestDTO getAccountRequestDTO);

  ListAccountResponseDTO listAccount(ListAccountRequestDTO listAccountRequestDTO);

  BaseRequestDTO modifyAccount(UpdateAccountRequestDTO updateAccountRequestDTO);
}
