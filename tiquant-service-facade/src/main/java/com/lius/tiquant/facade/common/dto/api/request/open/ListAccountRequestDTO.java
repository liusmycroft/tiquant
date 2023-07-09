package com.lius.tiquant.facade.common.dto.api.request.open;

import com.lius.tiquant.facade.common.dto.api.BaseListRequestDTO;
import com.lius.tiquant.facade.common.enums.AccountType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ListAccountRequestDTO extends BaseListRequestDTO {
  private AccountType type;
  private String accountId;
  private String accountName;
}
