package com.brkcco.starwars.dice;

import com.brkcco.starwars.core.BaseDiceEntity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;

@Entity
public class Dice extends BaseDiceEntity {
  private int diceSides;
  private String rollType;

  public Dice(String rollType) {
    super(rollType);
  }

  public int getDiceSides() {
    return diceSides;
  }

  public void setDiceSides(int diceSides) {
    this.diceSides = diceSides;
  }

  public String getRollType() {
    return rollType;
  }

  public void setRollType(String rollType) {
    this.rollType = rollType;
  }
}

