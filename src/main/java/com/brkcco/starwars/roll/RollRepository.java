package com.brkcco.starwars.roll;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RollRepository {
  private static final List<Roll> ROLL_TYPES = Arrays.asList(

      new Roll(1,"standard"),
      new Roll(2, "boost"),
      new Roll(3, "ability"),
      new Roll(4,"proficiency"),
      new Roll(5,"setback"),
      new Roll(6,"difficulty"),
      new Roll(7,"challenge"),
      new Roll(8,"force")
  );
  public List<Roll> getAllRollTypes() {return ROLL_TYPES;}

  public Roll findById(int id) {
    for (Roll roll: ROLL_TYPES) {
      if (roll.getId() == id){
        return roll;
      }
    }
    return null;
  }

  public Roll findByRollType(String rollTyple) {
    for(Roll roll: ROLL_TYPES) {
      if (roll.getRollType().contains(roll)) {
        return roll;
      }
    }
    return null;
  }



}
