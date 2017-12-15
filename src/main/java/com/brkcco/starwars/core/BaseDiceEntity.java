package com.brkcco.starwars.core;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseDiceEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private final Long id;

  protected BaseDiceEntity() {
    id = null;
  }
}
