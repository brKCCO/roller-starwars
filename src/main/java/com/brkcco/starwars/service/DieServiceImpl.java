package com.brkcco.starwars.service;

import com.brkcco.starwars.entities.Die;
import com.brkcco.starwars.repositories.DieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DieServiceImpl implements DieService {

  @Autowired
  private DieRepository dieRepository;


  @Override
  public List<Die> findAll() {
    return dieRepository.findAll();
  }

  @Override
  public List<Die> findDieByName(String dieName) {
    return dieRepository.findByDieName(dieName);
  }

  @Override
  public Die findById(Long id) {
    return dieRepository.findById(id);
  }

  @Override
  public void saveDie(Die die) {
    dieRepository.save(die);

  }


  public void save(List<Die> dieList) {
    dieRepository.save(dieList);
  }
}
