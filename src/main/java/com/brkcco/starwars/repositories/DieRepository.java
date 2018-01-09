package com.brkcco.starwars.repositories;

import com.brkcco.starwars.entities.Die;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("dieRespository")
public interface DieRepository extends CrudRepository<Die, Long> {
  List<Die> findAll();
  List<Die> findByDieName(String dieName);
  Die findById(Long id);
  Die save(Die die);
  void delete(Die die);

}
