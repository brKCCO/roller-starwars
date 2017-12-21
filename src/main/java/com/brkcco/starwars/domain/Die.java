package com.brkcco.starwars.domain;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.stream.IntStream;
import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Die extends BaseDiceEntity {
  @Column(nullable = false, unique = true)
  private String dieName;
  @Column(nullable = false)
  private Integer dieSides;
  @Column(nullable = false)
  private String dieType;
  @Column(nullable = false)
  private String[] dieFace;


  protected Die() {
    super();
  }

  public Die(String dieName, Integer dieSides, String dieType, String[] dieFace) {
    super();
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Die)) {
      return false;
    }
    Die die = (Die) o;
    return Objects.equals(getDieName(), die.getDieName()) &&
        Objects.equals(getDieSides(), die.getDieSides()) &&
        Arrays.equals(getDieFace(), die.getDieFace()) &&
        Objects.equals(getDieType(), die.getDieType());
  }

  @Override
  public int hashCode() {

    int result = Objects.hash(getDieName(), getDieSides(), getDieType());
    result = 31 * result + Arrays.hashCode(getDieFace());
    return result;
  }

  @Override
  public String toString() {
    return "Die{" +
        "dieName='" + dieName + '\'' +
        ", dieSides=" + dieSides +
        ", dieFace=" + Arrays.toString(dieFace) +
        ", dieType='" + dieType + '\'' +
        '}';
  }




}

