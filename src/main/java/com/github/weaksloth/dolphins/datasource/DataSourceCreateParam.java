package com.github.weaksloth.dolphins.datasource;

import lombok.Data;
import lombok.experimental.Accessors;

/** 创建数据源参数 */
@Data
@Accessors(chain = true)
public class DataSourceCreateParam {

  private String database;

  private String host;

  private String name;

  private String userName;

  private String password;

  private String type;

  private String port;

  private String note;
}
