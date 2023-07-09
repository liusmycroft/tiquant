package com.lius.tiquant.facade.common.dto.api.request.open;

import com.lius.tiquant.facade.common.dto.api.BaseRequestDTO;
import com.lius.tiquant.facade.common.enums.FirmTradeStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UpdateFirmTradeRequestDTO extends BaseRequestDTO {
  private String name;
  private FirmTradeStatus firmTradeStatus;
}
