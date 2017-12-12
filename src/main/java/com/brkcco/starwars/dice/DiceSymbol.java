package com.brkcco.starwars.dice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class DiceSymbol extends Dice{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer resultId;
  private String resultType;
  private String resultName;

  public DiceSymbol(Integer resultId, String rollType, String resultType,
                    String resultName) {

    super(rollType);
    this.resultId = resultId;
    this.resultType = resultType;
    this.resultName = resultName;
  }

  public Integer getResultId() {
    return resultId;
  }

  public void setResultId(Integer resultId) {
    this.resultId = resultId;
  }

  public String getResultType() {
    return resultType;
  }

  public void setResultType(String resultType) {
    this.resultType = resultType;
  }

  public String getResultName() {
    return resultName;
  }

  public void setResultName(String resultName) {
    this.resultName = resultName;
  }

  public DiceSymbol(String rollType) {
    super(rollType);
  }
}
