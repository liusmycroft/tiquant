package com.lius.tiquant.facade.common.dto.api;

import com.lius.tiquant.facade.common.ToString;
import com.lius.tiquant.facade.common.enums.CallerBid;
import com.lius.tiquant.facade.common.enums.CallerType;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BaseRequestDTO extends ToString {
  private String requestId;
  private CallerType callerType;
  private String callerId;
  private String callerParentId;
  private CallerBid callerBid;
  private String callerIp;
  private String accessKeyId;
  private String signature;
  private String apiName;
  private String product;
  private String version;
}
