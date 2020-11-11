package com.lcdlv.compte;

import java.util.ArrayList;

public interface Account {

    public void depot(Double montant);

    public void retrait(Double montant);

    public Double getSolde();

    public ArrayList<Operation> getHistorique();

}