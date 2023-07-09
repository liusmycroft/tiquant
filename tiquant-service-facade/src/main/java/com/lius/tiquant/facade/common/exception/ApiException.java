package com.lius.tiquant.facade.common.exception;

import com.lius.tiquant.facade.common.enums.ApiErrorCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ApiException extends RuntimeException {
  private static final long serialVersionUID = -1980287078551257172L;

  private String errorCode;
  private String errorMessage;
  private String requestId;

  public ApiException(ApiErrorCode errorCode) {
    this(errorCode, null, null);
  }

  public ApiException(ApiErrorCode errorCode, String dynamicCode) {
    this(errorCode, dynamicCode, null);
  }

  public ApiException(ApiErrorCode errorCode, String dynamicCode, Throwable cause) {
    super(cause);
    final String errorCodePattern = errorCode.getErrorCodePattern();
    this.errorCode = dynamicCode == null ? errorCodePattern : String.format(errorCodePattern, dynamicCode);
    this.errorMessage = errorCode.getErrorMessage();
  }
}
