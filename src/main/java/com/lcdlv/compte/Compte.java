package com.lcdlv.compte;

import java.util.ArrayList;

public class Compte implements Account{

    private Double solde;
    private ArrayList<Operation> historique;

    public Compte() {
        this.solde = Double.valueOf(0);
        this.historique = new ArrayList<>();
    }

    @Override
    public void depot(Double montant) {
        this.solde += montant;
        this.historique.add(new Depot(montant, this.solde));
    }

    @Override
    public void retrait(Double montant) {
        this.solde -= montant;
        this.historique.add(new Retrait(montant, this.solde));
    }

    @Override
    public Double getSolde() {
        return this.solde;
    }
}
