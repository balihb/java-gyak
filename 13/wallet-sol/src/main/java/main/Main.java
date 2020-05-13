package main;

import money.Denomination;
import wallet.NegativeDenominationCountException;
import wallet.Wallet;

import java.util.*;

import static money.Denomination.*;

public class Main {
    public static void main(String[] args) {
        Wallet bigWallet;
        Wallet smallWallet;
        Wallet smallWallet2;

        Map<Denomination, Integer> bwCont = new HashMap<Denomination, Integer>();
        bwCont.put(TWENTY_THOUSAND, 2);
        bwCont.put(FIVE, 4);

        Map<Denomination, Integer> swCont = new HashMap<Denomination, Integer>();
        swCont.put(TWENTY, 10);
        swCont.put(ONE_HUNDRED, 2);
        swCont.put(TWO_THOUSAND, 2);

        try {
            bigWallet = new Wallet(bwCont);
            smallWallet = new Wallet(swCont);
            smallWallet2 = new Wallet(swCont);

            System.out.println(bigWallet);

            System.out.println(bigWallet.compareTo(smallWallet));
            System.out.println(smallWallet.compareTo(bigWallet));
            System.out.println(smallWallet.compareTo(smallWallet2));
            System.out.println(smallWallet.compareTo(smallWallet));

            List<Wallet> wallets = new ArrayList<Wallet>();
            wallets.add(smallWallet);
            wallets.add(bigWallet);
            wallets.add(smallWallet2);

            System.out.println(wallets);

            Collections.sort(wallets);

            System.out.println(wallets);

        } catch (NegativeDenominationCountException e) {
            e.printStackTrace();
        }
    }
}
