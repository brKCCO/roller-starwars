package com.brkcco.starwars.dao;


import com.brkcco.starwars.domain.Die;

import org.springframework.data.repository.CrudRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@RestResource(rel = "die", path = "dice")
public interface DiceDao extends CrudRepository<Die, Long> {
  @SuppressWarnings("SpringDataRepositoryMethodReturnTypeInspection")
  Optional<Die> findById(Long id);

  List<Die> findByDieName(String dieName);

  default String findByDieType(String dieType) {
    return dieType;
  }
  List<Die> findByDieSides(String dieSides);

  default String findByDiceFace(String dieFace) {
    return dieFace;
  }


}

