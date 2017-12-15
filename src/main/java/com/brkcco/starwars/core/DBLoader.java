package com.brkcco.starwars.core;

import com.brkcco.starwars.diceroll.Dice;
import com.brkcco.starwars.diceroll.DiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class DBLoader implements ApplicationRunner {

  private final DiceRepository diceRepo;

  @Autowired
  public DBLoader(DiceRepository diceRepo) {
    this.diceRepo = diceRepo;
  }

  @Override
  public void run(ApplicationArguments args) throws Exception {
    List<Dice> ALL_DICE = Arrays.asList(
        new Dice("boost", 6, "positive",
            new String[]{"blank", "blank", "success", "success advantage", "double advantage",
                "advantage"}),
        new Dice("setback", 6, "negative",
            new String[]{"blank", "blank", "failure", "failure", "threat", "threat"}),
        new Dice("ability", 8, "positive",
            new String[]{"blank", "success", "success", "double success", "advantage", "advantage",
                "success advantage", "double advantage"}),
        new Dice("difficulty", 8, "negative",

            new String[]{"blank", "failure", "double failure", "threat", "threat", "threat",
                "double threat", "failure threat"}),
        new Dice("proficiency", 12, "positive",
            new String[]{"blank", "success", "success", "double success", "double success",
                "advantage", "success advantage", "success advantage", "success advantage",
                "double advantage", "double advantage", "triumph"}),
        new Dice("challenge", 12, "negative",
            new String[]{"failure", "failure", "double failure", "double failure", "threat",
                "threat", "failure threat", "failure threat", "double threat", "double threat",
                "despair"}),
        new Dice("force", 12, "force",
            new String[]{"dark", "dark", "dark", "dark", "dark", "dark", "double dark", "light",
                "light", "double light", "double light", "double light"}),
        new Dice("standard", 10, "standard",
            new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"}
        ));

    List<Dice> allDice = new ArrayList<>();

    IntStream.range(0, ALL_DICE.size())
        .forEach(i -> {
          Dice d = ALL_DICE.get(i % ALL_DICE.size());
          allDice.add(d);
        });
    diceRepo.save(allDice);
  }


}
