package com.lius.tiquant.facade.common;

import java.io.Serializable;

import lombok.Data;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Data
public class ToString implements Serializable {
  private static final long serialVersionUID = -1201052545894619488L;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
  }
}
