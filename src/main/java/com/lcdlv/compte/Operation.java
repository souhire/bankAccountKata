package com.lcdlv.compte;

import java.util.Date;

public abstract class Operation {

    private Type type;
    private Date date;
    private Double montant;
    private Double solde;

    public Operation(Type type, Date date, Double montant, Double solde) {
        this.type = type;
        this.date = date;
        this.montant = montant;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "type=" + type +
                ", date=" + date +
                ", montant=" + montant +
                ", solde=" + solde +
                '}';
    }
}
