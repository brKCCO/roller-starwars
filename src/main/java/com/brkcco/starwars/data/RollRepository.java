package com.brkcco.starwars.data;

import com.brkcco.starwars.roll.Roll;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RollRepository {
  private static final List<Roll> ROLL_TYPES = Arrays.asList(

      new Roll(1,"standard", 10, " "),
      new Roll(2,"boost", 6, " "),
      new Roll(5,"setback",6, " "),
      new Roll(3,"ability", 8, " "),
      new Roll(6,"difficulty", 8, " "),
      new Roll(4,"proficiency", 12, " "),
      new Roll(7,"challenge", 12, " "),
      new Roll(8,"force", 12, " ")
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
      if (roll.getRollName().contains(roll)) {
        return roll;
      }
    }
    return null;
  }



}
