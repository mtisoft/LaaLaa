package com.server.laalaa.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Equipe {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer IDEQUIPE;

  private String CODE_EQUIPE;

  private String MAT_SUPERVISEUR;

  public String getCODE_EQUIPE() {
    return CODE_EQUIPE;
  }

  public void setCODE_EQUIPE(String cODE_EQUIPE) {
    CODE_EQUIPE = cODE_EQUIPE;
  }

  public String getMAT_SUPERVISEUR() {
    return MAT_SUPERVISEUR;
  }

  public void setMAT_SUPERVISEUR(String mAT_SUPERVISEUR) {
    MAT_SUPERVISEUR = mAT_SUPERVISEUR;
  }

  public Integer getIDEQUIPE() {
    return IDEQUIPE;
  }

  public void setIDEQUIPE(Integer iDEQUIPE) {
    IDEQUIPE = iDEQUIPE;
  }

}