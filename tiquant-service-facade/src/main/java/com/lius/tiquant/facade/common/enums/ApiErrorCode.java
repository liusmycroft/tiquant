package com.lius.tiquant.facade.common.enums;

public enum ApiErrorCode {

  /**
   * 缺少参数
   */
  MISSING_PARAMETER("MissingParameter.%s"),
  /**
   * 无效参数
   */
  INVALID_PARAMETER("InvalidParameter.%s"),
  /**
   * 服务不可用
   */
  INTERNAL_ERROR("InternalError"),
  /**
   * 无权限
   */
  NO_PERMISSION("NoPermission.%s"),
  ;
  private final String errorCodePattern;
  private final String errorMessage;

  ApiErrorCode(String errorCodePattern, String errorMessage) {
    this.errorCodePattern = errorCodePattern;
    this.errorMessage = errorMessage;
  }

  ApiErrorCode(String errorCodePattern) {
    this.errorCodePattern = errorCodePattern;
    this.errorMessage = "";
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public String getErrorCodePattern() {
    return errorCodePattern;
  }

}
