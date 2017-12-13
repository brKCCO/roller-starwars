package com.brkcco.starwars.dice;

import com.brkcco.starwars.core.BaseDiceEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


public class Dice extends BaseDiceEntity  {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @OneToMany(mappedBy = "rollname")
  private String rollName;
  @OneToMany(mappedBy = "dicesides")
  private Integer diceSides;
  private String diceClass;

  protected Dice() {super();}

  public Dice( String rollName, Integer diceSides, String diceClass) {
    this();
    this.id = id;
    this.rollName = rollName;
    this.diceSides = diceSides;
    this.diceClass = diceClass;
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Integer getDiceSides() {
    return diceSides;
  }

  public void setDiceSides(Integer diceSides) {
    this.diceSides = diceSides;
  }

  public String getRollName() {
    return rollName;
  }

  public void setRollName(String rollName) {
    this.rollName = rollName;
  }

  public String getDiceClass() {
    return diceClass;
  }

  public void setDiceClass(String diceClass) {
    this.diceClass = diceClass;
  }
}

