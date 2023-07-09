package com.lius.tiquant.facade.common.dto.api.response.open;

import java.util.List;

import com.lius.tiquant.facade.common.dto.SimpleAccountDTO;
import com.lius.tiquant.facade.common.dto.api.BaseListRequestDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ListAccountResponseDTO extends BaseListRequestDTO {
  private List<SimpleAccountDTO> accounts;
}
