package com.lius.tiquant.facade.common.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BackTestRecordDTO {
  private String backTestId;
  private String recordId;
}
