package com.lcdlv.compte;

import java.util.Date;

public class Depot extends Operation {


    public Depot(Double montant, Double solde) {
        super(Type.DEPOT, new Date(), montant, solde);
    }

}
