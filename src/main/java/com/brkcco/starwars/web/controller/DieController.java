package com.brkcco.starwars.web.controller;

import com.brkcco.starwars.dao.DiceDao;
import com.brkcco.starwars.domain.Die;
import com.brkcco.starwars.service.DiceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dice")
public class DieController {
  @Autowired
  private DiceDao diceDao;

  @GetMapping
  public Iterable findAll() {
    return diceDao.findAll();
  }

  @GetMapping("/die/{dieName}")
  public List<Die> findByTitle(@PathVariable String dieName) throws DiceNotFoundException{
    return diceDao.findByDieName(dieName);
  }

  @GetMapping("/die/{id}")
  public Die findOne(@PathVariable long id) {
    return diceDao.findOne(id);
  }

  @GetMapping("/diesides/{diceSides}")
  public List<Die> findByDieSides(@PathVariable String dieSides) {
    return diceDao.findByDieSides(dieSides);
  }








}
