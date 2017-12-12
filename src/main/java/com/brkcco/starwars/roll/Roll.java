package com.brkcco.starwars.roll;

import com.brkcco.starwars.core.BaseDiceEntity;

import javax.persistence.Entity;

@Entity
public class Roll extends BaseDiceEntity implements CharSequence {
  private Integer id;
  private String rollName;
  private Integer diceSides;
  private String diceFace;

  public Roll() {super();
  }

  public Roll(Integer id, String rollName, Integer diceSides, String diceFace) {

    this.id = id;
    this.rollName = rollName;
  }

  public Integer getDiceSides() {
    return diceSides;
  }

  public void setDiceSides(Integer diceSides) {
    this.diceSides = diceSides;
  }

  public String getDiceFace() {
    return diceFace;
  }

  public void setDiceFace(String diceFace) {
    this.diceFace = diceFace;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getRollName() {
    return rollName;
  }

  public void setRollName(String rollName) {
    this.rollName = rollName;
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
