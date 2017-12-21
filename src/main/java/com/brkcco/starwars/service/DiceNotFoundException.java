package com.brkcco.starwars.service;

public class DiceNotFoundException extends RuntimeException {
  public DiceNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
