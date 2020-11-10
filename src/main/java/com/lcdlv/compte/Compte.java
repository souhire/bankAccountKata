package com.lcdlv.compte;

public class Compte implements Account{

    private Double solde;

    @Override
    public void depot(Double montant) {

    }

    @Override
    public void retrait(Double montant) {

    }

    @Override
    public Double getSolde() {
        return this.solde;
    }
}
