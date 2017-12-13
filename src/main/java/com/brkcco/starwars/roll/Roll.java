package com.brkcco.starwars.roll;

import com.brkcco.starwars.core.BaseDiceEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roll extends BaseDiceEntity implements CharSequence {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private String resultName;
  private String diceFace;
  private String resultType;

  public Roll() {super();
  }

  public Roll( String resultName, String diceFace,
              String resultType) {

    this.id = id;
    this.diceFace = diceFace;
    this.resultName = resultName;
    this.resultType = resultType;

  }

  public String getResultType() {
    return resultType;
  }

  public void setResultType(String resultType) {
    this.resultType = resultType;
  }

  public String getDiceFace() {
    return diceFace;
  }

  public void setDiceFace(String diceFace) {
    this.diceFace = diceFace;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getResult() {
    return resultName;
  }

  public void setResult(String result) {
    this.resultName = result;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return 0;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
