package com.brkcco.starwars.dice;

import com.brkcco.starwars.core.BaseDiceEntity;
import com.brkcco.starwars.roll.Roll;


public class Dice extends BaseDiceEntity  {
  private Integer id;
  private String diceName;
  private Integer diceSides;
  private String diceClass;

  public Dice(Integer id, String diceName, Integer diceSides, String diceClass) {
    this.id = id;
    this.diceName = diceName;
    this.diceSides = diceSides;
    this.diceClass = diceClass;
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

  public String getDiceName() {
    return diceName;
  }

  public void setDiceName(String diceName) {
    this.diceName = diceName;
  }

  public String getDiceClass() {
    return diceClass;
  }

  public void setDiceClass(String diceClass) {
    this.diceClass = diceClass;
  }
}

