package com.brkcco.starwars.diceroll;

import com.brkcco.starwars.core.BaseDiceEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


@Entity
public class Dice extends BaseDiceEntity  {
  @NotNull
  private String diceName;
  private Integer diceSides;
  private String diceFace;
  private String diceType;

  @ManyToOne
  private Roll roll;

  protected Dice() {super();}

  public Dice(String diceName, Integer diceSides, String diceType, String diceFace) {
    this();
    this.diceFace = diceFace;

    this.diceName = diceName;
    this.diceSides = diceSides;
    this.diceType = diceType;
  }

  public String getDiceName() {return diceName;  }

  public void setDiceName(String diceName) {  this.diceName = diceName;  }

  public Integer getDiceSides() {    return diceSides;  }

  public void setDiceSides(Integer diceSides) { this.diceSides = diceSides;  }

  public String getDiceFace() {    return diceFace;  }

  public void setDiceFace(String diceFace) {    this.diceFace = diceFace;  }

  public String getDiceType() {    return diceType;  }

  public void setDiceType(String diceType) {    this.diceType = diceType;  }

  public Roll getRoll() {    return roll;  }

  public void setRoll(Roll roll) {    this.roll = this.roll;  }
}

