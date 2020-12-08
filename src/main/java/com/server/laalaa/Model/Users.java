package com.server.laalaa.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Users {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer IDUSER;

  private String MATRICULE;

  private String PASSW;

  private String CODE_TYPE;

  private String CODE_EQUIPE;

  private String NOM;

  private String PRENOM;

  private char SEXE;

  private Integer TELEPHONE;

  private String POSTE;

  public Integer getIDUSER() {
    return IDUSER;
  }

  public void setIDUSER(Integer iDUSER) {
    IDUSER = iDUSER;
  }

  public String getMATRICULE() {
    return MATRICULE;
  }

  public void setMATRICULE(String mATRICULE) {
    MATRICULE = mATRICULE;
  }

  public String getCODE_TYPE() {
    return CODE_TYPE;
  }

  public void setCODE_TYPE(String cODE_TYPE) {
    CODE_TYPE = cODE_TYPE;
  }

  public String getCODE_EQUIPE() {
    return CODE_EQUIPE;
  }

  public void setCODE_EQUIPE(String cODE_EQUIPE) {
    CODE_EQUIPE = cODE_EQUIPE;
  }

  public String getNOM() {
    return NOM;
  }

  public void setNOM(String nOM) {
    NOM = nOM;
  }

  public String getPRENOM() {
    return PRENOM;
  }

  public void setPRENOM(String pRENOM) {
    PRENOM = pRENOM;
  }

  public char getSEXE() {
    return SEXE;
  }

  public void setSEXE(char sEXE) {
    SEXE = sEXE;
  }

  public Integer getTELEPHONE() {
    return TELEPHONE;
  }

  public void setTELEPHONE(Integer tELEPHONE) {
    TELEPHONE = tELEPHONE;
  }

  public String getPOSTE() {
    return POSTE;
  }

  public void setPOSTE(String pOSTE) {
    POSTE = pOSTE;
  }

  public String getPASSW() {
    return PASSW;
  }

  public void setPASSW(String pASSW) {
    PASSW = pASSW;
  }

}
