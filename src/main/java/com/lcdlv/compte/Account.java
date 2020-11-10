package com.lcdlv.compte;

public interface Account {

    public void depot(Double montant);

    public void retrait(Double montant);

    public Double getSolde();

}