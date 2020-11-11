package com.lcdlv.compte;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operation operation = (Operation) o;
        return type == operation.type &&
                new SimpleDateFormat("dd-MM-yyyy").format(date)
                .equals(new SimpleDateFormat("dd-MM-yyyy").format(operation.date)) &&
                montant.equals(operation.montant) &&
                solde.equals(operation.solde);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, date, montant, solde);
    }
}
