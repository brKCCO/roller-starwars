package com.brkcco.starwars.diceroll;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;


@Component
public interface DiceRepository extends PagingAndSortingRepository<Dice, Long> {
  Dice findById(String id);

  Dice findByDiceName(String diceName);

  default String findByDiceType(String diceType) {
    return diceType;
  }

  default String findByResultType(String resultType) {
    return resultType;
  }

  default String findByDiceFace(String diceFace) {
    return diceFace;
  }


}

