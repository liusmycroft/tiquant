package com.lius.tiquant.facade.api.open;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import com.lius.tiquant.facade.common.dto.api.request.open.*;
import com.lius.tiquant.facade.common.dto.api.response.open.GetBackTestResponseDTO;
import com.lius.tiquant.facade.common.dto.api.response.open.ListBackTestResponseDTO;

public interface BackTestOpenApiService {
  BaseResponseDTO createBackTest(CreateBackTestRequestDTO createBackTestRequestDTO);

  BaseResponseDTO runBackTest(RunBackTestRequestDTO runBackTestRequestDTO);

  GetBackTestResponseDTO describeBackTest(GetBackTestRequestDTO getBackTestRequestDTO);

  ListBackTestResponseDTO listBackTest(ListBackTestRequestDTO listBackTestRequestDTO);

  BaseRequestDTO modifyBackTest(UpdateBackTestRequestDTO updateBackTestRequestDTO);

}
