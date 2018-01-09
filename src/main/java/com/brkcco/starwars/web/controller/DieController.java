package com.brkcco.starwars.web.controller;

import com.brkcco.starwars.entities.Die;
import com.brkcco.starwars.entities.Roll;
import com.brkcco.starwars.service.DieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class DieController {
  @Autowired
  private DieService dieService;

  @SuppressWarnings("unchecked")
  @GetMapping("/dice")
  public String listDice(Model model) {
    List<Die> allDice = dieService.findAll();
    model.addAttribute("dice", allDice);
    return "home";
  }

  // Single GIF page
  @GetMapping("/dice/{dieName}")
  public String gifDetails(@PathVariable Long dieName, Model model) {
    // TODO: Get gif whose id is gifId
    Die die = null;

    model.addAttribute("die", die);
    return "die/details";
  }
  @GetMapping("/dice/{dieName}/roll")
  public String rollResult(@PathVariable Long dieName, Model model,@RequestParam int rollCount) throws IOException {
    Die die = dieService.findById(dieName);
    Roll roll = new Roll(die, rollCount);
    return roll.getResult();

  }





}
