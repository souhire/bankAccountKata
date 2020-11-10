package com.lcdlv.compte;

import java.util.Date;

public class Retrait extends Operation {

    public Retrait(Double montant, Double solde) {
        super(Type.RETRAIT, new Date(), montant, solde);
    }
}
