package com.brkcco.starwars.diceroll;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;


@Component
public interface RollRepository extends PagingAndSortingRepository<Roll, Long> {

  Roll findById(String id);
  Roll findByResultType(String resultType);





}
