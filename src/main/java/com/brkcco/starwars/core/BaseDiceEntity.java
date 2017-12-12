package com.brkcco.starwars.core;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseDiceEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  protected BaseDiceEntity() {
    id = null;
  }
}
