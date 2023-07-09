package com.lius.tiquant.facade.common.dto.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BaseListRequestDTO extends BaseRequestDTO{
  private Integer pageNum;
  private Integer pageSize;
}
