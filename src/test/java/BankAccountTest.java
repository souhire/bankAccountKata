import com.lcdlv.compte.Compte;
import com.lcdlv.compte.Depot;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankAccountTest {

    Compte compte;
    Double solde;
    Double montant;

    @BeforeAll
    public void setUp() {
        this.compte = new Compte();
        this.solde = compte.getSolde();
        this.montant = Math.random()*1000;
    }

    @Test
    public void testDepotSurCompte() {
        this.compte.depot(this.montant);
        assertEquals(this.solde + this.montant, this.compte.getSolde());
        this.solde += this.montant;
    }

    @Test
    public void testRetraitSurCompte() {
        this.compte.retrait(this.montant);
        assertEquals(this.solde - this.montant, this.compte.getSolde());
        this.solde -= this.montant;
    }

    @Test()
    public void testHistoriqueDuCompte() {
        this.compte.depot(this.montant);
        this.compte.retrait(this.montant);
        assertEquals(this.compte.getHistorique().size(), 2);
    }

    @Test
    public void testFirstValueInHistoriqueShouldBeADepot() {
        this.compte.depot(this.montant);
        this.compte.retrait(this.montant);
        assertEquals(this.compte.getHistorique().get(0), new Depot(this.montant, this.montant));
    }


}
