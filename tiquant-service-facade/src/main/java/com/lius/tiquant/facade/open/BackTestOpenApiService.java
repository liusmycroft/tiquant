package com.lius.tiquant.facade.open;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.CreateAccountRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.GetBackTestRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.ListBackTestRequestDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.UpdateBackTestRequestDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.GetBackTestResponseDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.ListBackTestResponseDTO;

public interface BackTestOpenApiService {
  BaseResponseDTO createBackTest(CreateAccountRequestDTO createAccountRequestDTO);

  GetBackTestResponseDTO describeBackTest(GetBackTestRequestDTO getBackTestRequestDTO);

  ListBackTestResponseDTO listBackTest(ListBackTestRequestDTO listBackTestRequestDTO);

  BaseRequestDTO modifyBackTest(UpdateBackTestRequestDTO updateBackTestRequestDTO);

}
