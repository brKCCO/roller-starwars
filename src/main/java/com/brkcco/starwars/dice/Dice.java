package com.brkcco.starwars.dice;

import com.brkcco.starwars.core.BaseDiceEntity;
import com.brkcco.starwars.roll.Roll;


public class Dice extends BaseDiceEntity {
  private Integer id;
  private Integer diceSides;
  private String diceType;

  public Dice(String rollType) {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getDiceSides() {
    return diceSides;
  }

  public void setDiceSides(Integer diceSides) {
    this.diceSides = diceSides;
  }

  public String getDiceType() {
    return diceType;
  }

  public void setDiceType(String diceType) {
    this.diceType = diceType;
  }
}

