package com.lius.tiquant.facade.common.dto.api;

import com.lius.tiquant.facade.common.ToString;
import com.lius.tiquant.facade.common.enums.ApiErrorCode;
import com.lius.tiquant.facade.common.exception.ApiException;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BaseResponseDTO extends ToString {
  private String requestId;
  private Boolean success;
  private String errorCode;
  private String errorMessage;

  public static <T extends BaseResponseDTO> T ok(Class<T> clazz, String requestId) {
    T result = newInstance(clazz);
    result.setRequestId(requestId);
    result.setSuccess(true);
    return result;
  }

  public static BaseResponseDTO fail(String requestId, ApiErrorCode errorCode) {
    BaseResponseDTO result = new BaseResponseDTO();
    result.setRequestId(requestId);
    result.setSuccess(false);
    result.setErrorCode(errorCode.getErrorCodePattern());
    result.setErrorMessage(errorCode.getErrorMessage());
    return result;
  }

  public static BaseResponseDTO fail(String requestId, ApiException apiException) {
    BaseResponseDTO result = new BaseResponseDTO();
    result.setRequestId(requestId);
    result.setSuccess(false);
    result.setErrorCode(apiException.getErrorCode());
    result.setErrorMessage(apiException.getErrorMessage());
    return result;
  }

  private static <T extends BaseResponseDTO> T newInstance(Class<T> clazz) {
    T result;
    try {
      result = clazz.newInstance();
    } catch (Exception e) {
      throw new AssertionError("response class instantiate failed", e);
    }
    return result;
  }
}
