package wallet;

import money.Denomination;

import java.util.HashMap;
import java.util.Map;

public class Wallet implements Comparable<Wallet> {
    private final Map<Denomination, Integer> content = new HashMap<Denomination, Integer>();

    public void put(Denomination denom, Integer count) throws NegativeDenominationCountException {
        if (0 > count) {
            throw new NegativeDenominationCountException("Can not add negative count of coins or bills");
        }

        content.put(denom, content.getOrDefault(denom, 0) + count);
    }

    public void putAll(Map<Denomination, Integer> moneyToPut) throws NegativeDenominationCountException {
        for(Denomination denom : moneyToPut.keySet()){
            put(denom, moneyToPut.get(denom));
        }
    }

    public Wallet() {}

    public Wallet(Map<Denomination, Integer> moneyToPut) throws NegativeDenominationCountException {
        putAll(moneyToPut);
    }

    public Integer getValue(Denomination denom) {
        return content.getOrDefault(denom, 0) * denom.getValue();
    }

    public Integer getValue() {
        int value = 0;
        for (Denomination denom : content.keySet()) {
            value += content.get(denom) * denom.getValue();
        }
        return value;
    }

    @Override
    public int compareTo(Wallet otherWallet) {
        if(equals(otherWallet)) {
            return 0;
        }

        Integer selfValue = getValue();
        Integer otherValue = otherWallet.getValue();

        if(selfValue.equals(otherValue)) {
            return 0;
        } else if(selfValue > otherValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof Wallet) {
            Wallet otherWallet = (Wallet) o;

            return content.equals(otherWallet.content);
        } else {
            return false;
        }
    }
}
