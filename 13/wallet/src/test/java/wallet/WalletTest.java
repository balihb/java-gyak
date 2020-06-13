package wallet;

import money.Denomination;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.util.*;

import static money.Denomination.*;
import static org.junit.Assert.*;

public class WalletTest {
    Wallet bigWallet;
    Wallet smallWallet;
    Wallet smallWallet2;
    List<Wallet> walletsNotOrdered;
    List<Wallet> walletsOrdered;
    List<Wallet> walletsOrdered2;

    @Before
    public void init() throws NegativeDenominationCountException {
        Map<Denomination, Integer> bwCont = new HashMap<Denomination, Integer>();
        bwCont.put(TWENTY_THOUSAND, 2);
        bwCont.put(FIVE, 4);

        Map<Denomination, Integer> swCont = new HashMap<Denomination, Integer>();
        swCont.put(TWENTY, 10);
        swCont.put(ONE_HUNDRED, 2);
        swCont.put(TWO_THOUSAND, 2);

        bigWallet = new Wallet(bwCont);
        smallWallet = new Wallet(swCont);
        smallWallet2 = new Wallet(swCont);

        walletsNotOrdered = new ArrayList<Wallet>();
        walletsNotOrdered.add(smallWallet);
        walletsNotOrdered.add(bigWallet);
        walletsNotOrdered.add(smallWallet2);

        walletsOrdered = new ArrayList<Wallet>();
        walletsOrdered.add(smallWallet);
        walletsOrdered.add(smallWallet2);
        walletsOrdered.add(bigWallet);

        walletsOrdered2 = new ArrayList<Wallet>();
        walletsOrdered2.add(smallWallet2);
        walletsOrdered2.add(smallWallet);
        walletsOrdered2.add(bigWallet);
    }

    @Test
    public void compareBigSamll() {
        Assert.assertTrue(bigWallet.compareTo(smallWallet) == 1);
    }

    @Test
    public void compareSmallBig() {
        Assert.assertTrue(smallWallet.compareTo(bigWallet) == -1);
    }

    @Test
    public void compareSmallSmall() {
        Assert.assertTrue(smallWallet.compareTo(smallWallet) == 0);
    }

    @Test
    public void compareSmallSmall2() {
        assertTrue(smallWallet.compareTo(smallWallet2) == 0);
    }

    @Test
    public void compareOrdered() {
        Assert.assertEquals(walletsOrdered, walletsOrdered2);
    }

    @Test
    public void compareNotOrdered() {
        Assert.assertNotEquals(walletsOrdered, walletsNotOrdered);
    }

    @Test
    public void compareAfterOrder() {
        Collections.sort(walletsNotOrdered);
        Assert.assertEquals(walletsOrdered, walletsNotOrdered);
    }
}
