package com.brkcco.starwars.data;

import com.brkcco.starwars.dice.Dice;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DiceRepository {
  private static final List<Dice> ALL_DICE =Arrays.asList(
      new Dice("boost", 6, "positive"),
      new Dice("setback", 6, "negative"),
      new Dice("ability", 8, "positive"),
      new Dice("difficulty", 8, "negative"),
      new Dice("proficiency", 12, "positive"),
      new Dice("challenge", 12, "negative"),
      new Dice("force", 12, "force"),
      new Dice("standard", 10, "standard")
  );


  public static List<Dice> getAllDice() {
    return ALL_DICE;
  }

  public static Dice findByName(String name) {
    for(Dice dice : ALL_DICE) {
      if (dice.getRollName().equalsIgnoreCase(name)) {
        return dice;
      }
    }
    return null;
  }
  public List<Dice> findByDiceClass(String clazz ) {
    List<Dice> diceClass = new ArrayList<>();
    for (Dice dice : ALL_DICE) {
      if (dice.getDiceClass().equalsIgnoreCase(clazz)) {
        diceClass.add(dice);
      }
    }
    return diceClass;
  }

  public List<Dice> findByRollName(String rollname) {
    List<Dice> diceName = new ArrayList<>();
    for (Dice dice : ALL_DICE) {
      if (dice.getRollName().equalsIgnoreCase(rollname)) {
        diceName.add(dice);
      }
    }
    return diceName;
  }
}

