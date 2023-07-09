package com.lius.tiquant.facade.common.dto;

import com.lius.tiquant.facade.common.enums.AccountType;
import lombok.Data;

@Data
public class SimpleAccountDTO {
  private String id;
  private String name;
  private AccountType accountType;
}
