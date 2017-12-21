package com.brkcco.starwars.domain;

import java.io.IOException;
import java.util.Random;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

public class Roll {

  @ManyToOne
  private Die die;
  private Integer rollCount;
  private String result;

  public Roll() {
  }

  public Roll(Die die, Integer rollCount, String result) {
    this.die = die;
    this.rollCount = rollCount;
    this.result = result;
  }

  public Roll(Die die, Integer rollCount) throws IOException{
    int i;
    Random random = new Random();
    StringBuilder sb = new StringBuilder();
    String[] faces = die.getDieFace();
    Integer sides = die.getDieSides();
    for (i = 0; i < rollCount; i++) {
      switch (sides) {
        case 12:
          //read string from array
          int j = random.nextInt(faces.length);
          //return value of array position
          result = faces[j];
          setResult(result);
          break;
        case 10:
          int f = random.nextInt(die.getDieSides());
          int e = random.nextInt(die.getDieSides());
          //concatenate die1 & die2
          sb.append(f);
          sb.append(e);
          result = sb.toString();
          break;
        case 8:
          //read string from array
          int k = random.nextInt(faces.length);
          //return value of array position
          result = faces[k];
          setResult(result);
          break;
        case 6:
          //read string from array
          int l = random.nextInt(faces.length);
          //return value of array position
          result = faces[l];
          break;
        default:
          System.out.println("Invalid die");
          break;
      }

      System.out.println("You rolled a d" + sides + ", and got " + result);
    }
  }

  public Die getDie() {
    return die;
  }

  public void setDie(Die die) {
    this.die = die;
  }

  public Integer getRollCount() {
    return rollCount;
  }

  public void setRollCount(Integer rollCount) {
    this.rollCount = rollCount;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}
