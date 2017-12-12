package com.brkcco.starwars.dice;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DiceRepository {
  private static final List<Dice> ALL_DICE =Arrays.asList(
      new Dice(1, "boost", 6, "positive"),
      new Dice(1, "setback", 6, "negative"),
      new Dice(1, "ability", 8, "positive"),
      new Dice(1, "difficulty", 8, "negative"),
      new Dice(1, "proficiency", 12, "positive"),
      new Dice(1, "challenge", 12, "negative"),
      new Dice(1, "force", 12, "force"),
      new Dice(1, "standard", 10, "standard")
  );


  public static List<Dice> getAllDiceTypes() {
    return ALL_DICE;
  }

  public static Dice findByName(String name) {
    for(Dice dice : ALL_DICE) {
      if (dice.getDiceName().equals(name)) {
        return dice;
      }
    }
    return null;
  }
  public List<Dice> findByDiceId(int id ) {
    List<Dice> diceId = new ArrayList<>();
    for (Dice dice : ALL_DICE) {
      if (dice.getId() == id) {
        diceId.add(dice);
      }
    }
    return diceId;
  }


}

