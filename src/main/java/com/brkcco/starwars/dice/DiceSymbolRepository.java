package com.brkcco.starwars.dice;

import com.brkcco.starwars.roll.Roll;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public interface DiceSymbolRepository {
     List<DiceSymbol> RESULT_TYPES = Arrays.asList(

      new DiceSymbol(1,"standard","positive","success"),
      new DiceSymbol(2, "boost","positive","advantage"),
      new DiceSymbol(3, "ability", "positive","triumph"),
      new DiceSymbol(4,"proficiency","negative","failure"),
      new DiceSymbol(5,"setback","negative","threat"),
      new DiceSymbol(6,"difficulty","negative","despair")
  );

  public static List<DiceSymbol> getAllDiceResults() {
    return RESULT_TYPES;
  }

  public static DiceSymbol findByName(String name) {
    for(DiceSymbol diceSymbol : RESULT_TYPES) {
      if (diceSymbol.getResultName().equals(name)) {
        return diceSymbol;
      }
    }
    return null;
  }


}
