package com.lius.tiquant.facade.common.dto;

import com.lius.tiquant.facade.common.enums.CurrencyType;
import lombok.Data;

@Data
public class AccountDTO {
  private String id;
  private String name;
  /**
   * 可用资金
   */
  private String available;
  /**
   * 手续费
   */
  private String commission;
  /**
   * 币种
   */
  private CurrencyType currencyType;
  /**
   * 持仓盈亏
   */
  private String positionProfit;
  /**
   * 平仓盈亏
   */
  private String closeProfit;
  /**
   * 历史入金
   */
  private String deposit;
  /**
   * 历史出金
   */
  private String withdraw;
}
