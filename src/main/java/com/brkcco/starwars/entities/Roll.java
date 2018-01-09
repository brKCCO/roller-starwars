package com.brkcco.starwars.entities;

import java.io.IOException;
import java.util.Random;


public class Roll {

  private Die die;
  private Integer rollCount;
  private String result;

  public Roll() {
  }

  public Roll(Die die, Integer rollCount) {
    int i;
    for (i = 0; i < rollCount; i++) {
      Random random = new Random();
      String[] faces = die.getDieFace();
      Integer sides = die.getDieSides();
      int index = random.nextInt(die.getDieFace().length)+1;

      switch (sides) {
        case 12:
          //read string from array
          int j = random.nextInt(index);
          //return value of array position
          result = faces[j];
          setResult(result);
          break;
        case 10:
          int f = random.nextInt(index);
          int e = random.nextInt(index);
          //concatenate die1 & die2
          StringBuilder sb = new StringBuilder();
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
