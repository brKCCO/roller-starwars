package com.brkcco.starwars.controller;

import com.brkcco.starwars.diceroll.DiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RollController {
  @Autowired
  private DiceRepository diceRepository;

  /*@RequestMapping("/")
  public String listRolls(ModelMap modelMap) {
  }*/




}
