
package com.server.laalaa.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer IDCLIENT;
    private String CODE_CLIENT;
    private String NOM;
    private String PRENOM;
    private char SEXE;
    private Integer TELEPHONE;
    private Integer NBRE_CMDE;

    public Integer getIDCLIENT() {
        return IDCLIENT;
    }

    public void setIDCLIENT(Integer iDCLIENT) {
        IDCLIENT = iDCLIENT;
    }

    public String getCODE_CLIENT() {
        return CODE_CLIENT;
    }

    public void setCODE_CLIENT(String cODE_CLIENT) {
        CODE_CLIENT = cODE_CLIENT;
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

    public Integer getNBRE_CMDE() {
        return NBRE_CMDE;
    }

    public void setNBRE_CMDE(Integer nBRE_CMDE) {
        NBRE_CMDE = nBRE_CMDE;
    }
}