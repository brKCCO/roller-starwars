package com.brkcco.starwars.dice;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;


@Component
public interface DiceRepository extends PagingAndSortingRepository<Dice, Long> {

  Dice findById(String id);

  Dice findByDiceClass(String diceClass);

  Dice findByRollName(String rollName);

}

