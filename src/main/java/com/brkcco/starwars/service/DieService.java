package com.brkcco.starwars.service;

import com.brkcco.starwars.entities.Die;

import java.util.List;



public interface DieService {
   List<Die> findAll();
   List<Die> findDieByName(String dieName);
   Die findById(Long id);
   void saveDie(Die die);


}
