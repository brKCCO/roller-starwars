package com.brkcco.starwars.core;

import com.brkcco.starwars.diceroll.Die;
import com.brkcco.starwars.diceroll.DiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class DBLoader implements ApplicationRunner {
  @RestResource(rel = "dice", path = "dice")
  private final DiceRepository diceRepo;

  @Autowired
  public DBLoader(DiceRepository diceRepo) {
    this.diceRepo = diceRepo;
  }



  @Override
  public void run(ApplicationArguments args) {
    List<Die> ALL_Die = Arrays.asList(
        new Die("boost", 6, "positive",
            new String[]{"blank", "blank", "success", "success advantage", "double advantage",
                "advantage"}),
        new Die("setback", 6, "negative",
            new String[]{"blank", "blank", "failure", "failure", "threat", "threat"}),
        new Die("ability", 8, "positive",
            new String[]{"blank", "success", "success", "double success", "advantage", "advantage",
                "success advantage", "double advantage"}),
        new Die("difficulty", 8, "negative",

            new String[]{"blank", "failure", "double failure", "threat", "threat", "threat",
                "double threat", "failure threat"}),
        new Die("proficiency", 12, "positive",
            new String[]{"blank", "success", "success", "double success", "double success",
                "advantage", "success advantage", "success advantage", "success advantage",
                "double advantage", "double advantage", "triumph"}),
        new Die("challenge", 12, "negative",
            new String[]{"failure", "failure", "double failure", "double failure", "threat",
                "threat", "failure threat", "failure threat", "double threat", "double threat",
                "despair"}),
        new Die("force", 12, "force",
            new String[]{"dark", "dark", "dark", "dark", "dark", "dark", "double dark", "light",
                "light", "double light", "double light", "double light"}),
        new Die("standard", 10, "standard",
            new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"}
        ));

    List<Die> allDie = new ArrayList<>();

    IntStream.range(0, ALL_Die.size())
        .forEach(i -> {
          Die d = ALL_Die.get(i % ALL_Die.size());
          allDie.add(d);
        });
    diceRepo.save(allDie);
  }


}
