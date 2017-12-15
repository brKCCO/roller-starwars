package com.brkcco.starwars.diceroll;

import com.brkcco.starwars.core.BaseDiceEntity;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
public class Die extends BaseDiceEntity {
  @NotNull
  private String dieName;
  private Integer dieSides;
  private String[] dieFace;
  private String dieType;


  protected Die() {
    super();
  }

  public Die(String dieName, Integer dieSides, String dieType, String[] dieFace) {
    this.dieName = dieName;
    this.dieSides = dieSides;
    this.dieType = dieType;
    this.dieFace = dieFace;
  }

  public String getDieName() {
    return dieName;
  }

  public void setDieName(String dieName) {
    this.dieName = dieName;
  }

  public Integer getDieSides() {
    return dieSides;
  }

  public void setDieSides(Integer dieSides) {
    this.dieSides = dieSides;
  }

  public String[] getDieFace() {
    return dieFace;
  }

  public void setDieFace(String[] dieFace) {
    this.dieFace = dieFace;
  }

  public String getDieType() {
    return dieType;
  }

  public void setDieType(String dieType) {
    this.dieType = dieType;
  }


}

