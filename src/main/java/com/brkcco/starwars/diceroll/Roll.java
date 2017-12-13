package com.brkcco.starwars.diceroll;

import com.brkcco.starwars.core.BaseDiceEntity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Roll extends BaseDiceEntity {
  @NotNull
  private String resultType;

  @OneToMany(mappedBy = "roll", cascade = CascadeType.ALL)
  private List<Dice> diceList;

  protected Roll() {
    super();
    diceList = new ArrayList<>();
  }

  public Roll(String resultType) {
    this();
    this.resultType = resultType;
  }

  public List<Dice> getDiceList() {    return this.diceList;  }

  public void addDiceToRollList(Dice dice) {
    dice.setRoll(this);
    diceList.add(dice);
  }


  public String getResultType() {    return resultType;  }

  public void setResultType(String resultType) {    this.resultType = resultType;  }
}
