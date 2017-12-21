package com.brkcco.starwars.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
@EntityScan
public abstract class BaseDiceEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private final Long id;
  @Version
  private Long version;

  protected BaseDiceEntity() {
    id = null;
  }
}
