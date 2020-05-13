package wallet;

import java.util.Comparator;

public class WalletComparator implements Comparator<Wallet> {
    @Override
    public int compare(Wallet w1, Wallet w2) {
        if (w1.equals(w2)) {
            return 0;
        } else if (w1.getValue() > w2.getValue()) {
            return 1;
        } else if (w1.getValue().equals(w2.getValue())) {
            return 0;
        } else {
            return -1;
        }
    }
}
