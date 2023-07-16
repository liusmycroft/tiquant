package com.lius.tiquant.service.strategy.model;

import lombok.Data;

import java.util.Date;

@Data
public class Strategy {
  private String author;
  private String content;
  private Date createTime;
  private Date updateTIme;
}
