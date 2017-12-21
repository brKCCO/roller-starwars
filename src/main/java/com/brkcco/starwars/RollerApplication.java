package com.brkcco.starwars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.IOException;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("com.brkcco.starwars.domain")
@EnableJpaRepositories("com.brkcco.starwars.dao")
public class RollerApplication {

  public static void main(String[] args) throws IOException {
    SpringApplication.run(RollerApplication.class, args);


  }




}

