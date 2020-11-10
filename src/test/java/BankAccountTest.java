import com.lcdlv.compte.Compte;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class BankAccountTest {

    Compte compte;

    @BeforeAll
    public void setUp() {
        this.compte = new Compte();
    }

    @Test
    public void testDepotSurCompte() {
        fail("not implemented");
    }

    @Test
    public void testRetraitSurCompte() {
        fail("not implemented");
    }

    @Test
    public void testHistoriqueDuCompte() {
        fail("not implemented");
    }


}
