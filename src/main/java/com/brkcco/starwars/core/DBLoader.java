package com.brkcco.starwars.core;

import com.brkcco.starwars.diceroll.Dice;
import com.brkcco.starwars.diceroll.DiceRepository;
import com.brkcco.starwars.diceroll.Roll;
import com.brkcco.starwars.diceroll.RollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class DBLoader implements ApplicationRunner{
  private final RollRepository rolls;
  private final DiceRepository dice;

  @Autowired
  public DBLoader(RollRepository rolls, DiceRepository dice) {
    this.rolls = rolls;
    this.dice = dice;
  }


  @Override
  public void run(ApplicationArguments args) throws Exception {
    List<Roll> ROLL_TYPES = Arrays.asList(
        new Roll("positive" ),
        new Roll("negative" ),
        new Roll("standard" ),
        new Roll("force" )
    );
    rolls.save(ROLL_TYPES);




  List<Dice> ALL_DICE =Arrays.asList(
        new Dice("boost", 6, "positive","blank - blank - success - success advantage - double advantage - advantage"),
        new Dice("setback", 6, "negative","blank - blank - failure - failure - threat - threat"),
        new Dice("ability", 8, "positive","blank - success - success - double success - advantage - advantage - success advantage - double advantage"),
        new Dice("difficulty", 8, "negative","blank - failure - double failure - threat - threat - threat - double threat - failure threat"),
        new Dice("proficiency", 12, "positive","blank - success - success - double success - double success - advantage - success advantage - success advantage - success advantage - double advantage - double advantage - triumph"),
        new Dice("challenge", 12, "negative","failure - failure - double failure - double failure - threat - threat - failure threat - failure threat - double threat - double threat - despair"),
        new Dice("force", 12, "force","dark - dark - dark - dark - dark - dark - double dark - light - light - double light - double light - double light "),
        new Dice("standard", 10, "standard","1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 0")
    );
    dice.save(ALL_DICE);

    List<Roll> sortedRoll = new ArrayList<>();
    IntStream.range(0, 10)
        .forEach(i -> {

          Dice sortedRolls = ALL_DICE.get(i % ALL_DICE.toArray().length);


        });



  }
}
