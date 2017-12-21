package com.brkcco.starwars.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


import javax.sql.DataSource;

@Configuration
@PropertySource("application.properties")
public class DataConfig {
  @Autowired
  private Environment env;

  @Bean
  public DataSource dataSource() {
    BasicDataSource ds = new BasicDataSource();

    ds.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
    ds.setUrl(env.getProperty("spring.datasource.url"));
    ds.setUsername(env.getProperty("spring.datasource.username"));
    ds.setPassword(env.getProperty("spring.datasource.password"));
    return ds;
  }
}
