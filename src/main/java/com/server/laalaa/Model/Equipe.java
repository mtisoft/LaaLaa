package com.server.laalaa.Model;

import java.util.Date;

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

  private String LIBELLE_EQUIPE;

  private String COULEUR_EQUIPE;

  private Integer TEL_EQUIPE;

  private Integer WHATSAPP_EQUIPE;

  private String CODEE_VILLE_EQUIPE;

  private Date DATE_CREAT_EQUIPE;

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

  public String getLIBELLE_EQUIPE() {
    return LIBELLE_EQUIPE;
  }

  public void setLIBELLE_EQUIPE(String lIBELLE_EQUIPE) {
    LIBELLE_EQUIPE = lIBELLE_EQUIPE;
  }

  public String getCOULEUR_EQUIPE() {
    return COULEUR_EQUIPE;
  }

  public void setCOULEUR_EQUIPE(String cOULEUR_EQUIPE) {
    COULEUR_EQUIPE = cOULEUR_EQUIPE;
  }

  public Integer getTEL_EQUIPE() {
    return TEL_EQUIPE;
  }

  public void setTEL_EQUIPE(Integer tEL_EQUIPE) {
    TEL_EQUIPE = tEL_EQUIPE;
  }

  public Integer getWHATSAPP_EQUIPE() {
    return WHATSAPP_EQUIPE;
  }

  public void setWHATSAPP_EQUIPE(Integer wHATSAPP_EQUIPE) {
    WHATSAPP_EQUIPE = wHATSAPP_EQUIPE;
  }


  public Date getDATE_CREAT_EQUIPE() {
    return DATE_CREAT_EQUIPE;
  }

  public void setDATE_CREAT_EQUIPE(Date dATE_CREAT_EQUIPE) {
    DATE_CREAT_EQUIPE = dATE_CREAT_EQUIPE;
  }

  public String getCODEE_VILLE_EQUIPE() {
    return CODEE_VILLE_EQUIPE;
  }

  public void setCODEE_VILLE_EQUIPE(String cODEE_VILLE_EQUIPE) {
    CODEE_VILLE_EQUIPE = cODEE_VILLE_EQUIPE;
  }

}