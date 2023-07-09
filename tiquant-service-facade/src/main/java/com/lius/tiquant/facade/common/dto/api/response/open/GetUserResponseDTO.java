package com.lius.tiquant.facade.common.dto.api.response.open;

import com.lius.tiquant.facade.common.dto.UserDTO;
import com.lius.tiquant.facade.common.dto.api.BaseResponseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GetUserResponseDTO extends BaseResponseDTO {
  private UserDTO userDTO;
}
