
//TODO:CSD -- FIX ALL THIS IMPLEMENTATION SHIT


/*package com.brkcco.starwars.dice;

import com.brkcco.starwars.core.BaseDiceEntity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dice extends BaseDiceEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  @Column
  private Integer diceSides;
  @Column
  private String rollType;

  public Dice(String rollType) {
    final List<String> rollTypes = new ArrayList<>();
    rollTypes.add("standard");
    rollTypes.add("boost");
    rollTypes.add("ability");
    rollTypes.add("proficiency");
    rollTypes.add("setback");
    rollTypes.add("difficulty");
    rollTypes.add("challenge");
    rollTypes.add("force");

    this.rollType = rollType;

    if (rollTypes.contains(rollType)) {
      switch (rollType) {
        case "boost":
          diceSides = 6;
          break;
        case "setback":
          diceSides = 6;
          break;
        case "ability":
          diceSides = 8;
          break;
        case "difficulty":
          diceSides = 8;
          break;
        case "standard":
          diceSides = 10;
          break;
        case "challenge":
          diceSides = 12;
          break;
        case "force":
          diceSides = 12;
          break;
        case "proficiency":
          diceSides = 12;
          break;
      }
    } else {
      System.out.println("Invalid Roll Type");
    }
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
*/

