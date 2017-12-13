package com.brkcco.starwars.roll;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;


@Component
public interface RollRepository extends PagingAndSortingRepository<Roll, Long> {

  Roll findById(String id);
  Roll findByResultName(String resultName);
  Roll findByResultType(String resultType);





}
