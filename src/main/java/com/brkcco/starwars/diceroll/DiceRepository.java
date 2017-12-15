package com.brkcco.starwars.diceroll;


import com.brkcco.starwars.core.DBLoader;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Component;


@Component
@RestResource(rel = "die", path = "dice")
public interface DiceRepository extends PagingAndSortingRepository<Die, Long> {


  Die findById(String id);

  Die findByDieName(String dieName);

  default String findByDieType(String dieType) {
    return dieType;
  }
  default String findByDieSides(String dieSides) {
    return dieSides;
  }

  default String findByDiceFace(String dieFace) {
    return dieFace;
  }


}

