import org.junit.Test;
import static org.junit.Assert.*;

public class WalletTest {

    @Test
    public void testAddCard_validCard() {
        Wallet wallet = new Wallet();
        wallet.addCard("CIN");
        assertEquals(1, wallet.getCardHolder().size());
        assertTrue(wallet.getCardHolder().contains("CIN"));
    }

    @Test
    public void testAddCard_nullCard() {
        Wallet wallet = new Wallet();
        wallet.addCard(null);
        assertTrue(wallet.getCardHolder().isEmpty());
    }

    @Test
    public void testAddCard_emptyCard() {
        Wallet wallet = new Wallet();
        wallet.addCard("");
        assertTrue(wallet.getCardHolder().isEmpty());
    }

    @Test
    public void testAddCard_spacesOnly() {
        Wallet wallet = new Wallet();
        wallet.addCard("   ");
        assertTrue(wallet.getCardHolder().isEmpty());
    }

    @Test
    public void testLoseWallet() {
        Wallet wallet = new Wallet();
        wallet.lose();
        assertTrue(wallet.isLost());
    }

    @Test
    public void testNotLoseWallet() {
        Wallet wallet = new Wallet();
        assertFalse(wallet.isLost());
    }

    @Test
    public void testAddMoney() {
        Wallet wallet = new Wallet();
        wallet.addMoney(50);
        assertEquals(50, wallet.getMoney(), 0.001);
    }

    @Test
    public void testCheckMoney() {
        Wallet wallet = new Wallet();
        wallet.addMoney(100);
        assertTrue(wallet.checkMoney(80));
        assertFalse(wallet.checkMoney(150));
    }
}
