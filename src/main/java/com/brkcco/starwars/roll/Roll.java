package com.brkcco.starwars.roll;

import com.brkcco.starwars.core.BaseDiceEntity;
import com.brkcco.starwars.dice.Dice;

import javax.persistence.Entity;

@Entity
public class Roll extends BaseDiceEntity implements CharSequence {
  private Integer id;
  private String rollType;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getRollType() {
    return rollType;
  }

  public void setRollType(String rollType) {
    this.rollType = rollType;
  }

  public Roll(Integer id, String rollType) {

    this.id = id;
    this.rollType = rollType;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return 0;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
