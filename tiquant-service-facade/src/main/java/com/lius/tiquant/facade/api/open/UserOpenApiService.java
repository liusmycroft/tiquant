package com.lius.tiquant.facade.api.open;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.CreateAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.GetUserRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.UpdateUserRequestDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.GetUserResponseDTO;

public interface UserOpenApiService {

  BaseResponseDTO createUser(CreateAccountRequestDTO createAccountRequestDTO);

  GetUserResponseDTO describeUser(GetUserRequestDTO getUserRequestDTO);

  BaseRequestDTO modifyUser(UpdateUserRequestDTO updateUserRequestDTO);
}
