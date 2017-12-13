package com.brkcco.starwars.core;

import com.brkcco.starwars.dice.Dice;
import com.brkcco.starwars.dice.DiceRepository;
import com.brkcco.starwars.roll.Roll;
import com.brkcco.starwars.roll.RollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DBLoader implements ApplicationRunner{
  private RollRepository rolls;
  private DiceRepository dice;

  @Autowired
  public DBLoader(RollRepository rolls, DiceRepository dice) {
    this.dice = dice;
    this.rolls = rolls;
  }


  @Override
  public void run(ApplicationArguments args) throws Exception {
     List<Dice> ALL_DICE =Arrays.asList(
        new Dice("boost", 6, "positive"),
        new Dice("setback", 6, "negative"),
        new Dice("ability", 8, "positive"),
        new Dice("difficulty", 8, "negative"),
        new Dice("proficiency", 12, "positive"),
        new Dice("challenge", 12, "negative"),
        new Dice("force", 12, "force"),
        new Dice("standard", 10, "standard")
    );
    List<Roll> ROLL_TYPES = Arrays.asList(
        new Roll("success", " ", "positive"),
        new Roll("advantage", " ", "positive"),
        new Roll("triumph", " ", "positive"),
        new Roll("failure", " ", "negative"),
        new Roll("threat", " ", "negative"),
        new Roll("despair", " ", "negative"),
        new Roll("standard", " ", "standard"),
        new Roll("lightForce", " ", "lightForce"),
        new Roll("darkForce", " ", "darkForce")
    );
  }
}
