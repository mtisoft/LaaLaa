package com.server.laalaa.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity  // this tel to hibernate to create a table base on this class.
public class TypeUser {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer IDTYPE;

    private String CODE_TYPE;

    private String LIBELLE;

    public Integer getIDTYPE() {
        return IDTYPE;
    }

    public void setIDTYPE(Integer iDTYPE) {
        IDTYPE = iDTYPE;
    }

    public String getCODE_TYPE() {
        return CODE_TYPE;
    }

    public void setCODE_TYPE(String cODE_TYPE) {
        CODE_TYPE = cODE_TYPE;
    }

    public String getLIBELLE() {
        return LIBELLE;
    }

    public void setLIBELLE(String lIBELLE) {
        LIBELLE = lIBELLE;
    }
}
