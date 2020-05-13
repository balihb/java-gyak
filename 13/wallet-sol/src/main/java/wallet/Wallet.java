package wallet;

import money.Denomination;

import java.util.HashMap;
import java.util.Map;

public class Wallet implements Comparable<Wallet> {
    private final Map<Denomination, Integer> content = new HashMap<Denomination, Integer>();

    public Wallet() {
    }

    public Wallet(Map<Denomination, Integer> moneyToPut) throws NegativeDenominationCountException {
        putAll(moneyToPut);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        for (Denomination denom : content.keySet()) {
            sb.append("\n\t");
            sb.append(denom);
            sb.append(": ");
            sb.append(content.get(denom));
        }

        return "Wallet{" +
                sb.toString() +
                "\n}";
    }

    @Override
    public int compareTo(Wallet otherWallet) {
        if (equals(otherWallet)) {
            return 0;
        } else if (getValue() > otherWallet.getValue()) {
            return 1;
        } else if (getValue().equals(otherWallet.getValue())) {
            return 0;
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

    @Override
    public int hashCode() {
        return content.hashCode();
    }

    public void put(Denomination denom, Integer count) throws NegativeDenominationCountException {
        if (0 > count) {
            throw new NegativeDenominationCountException("Can not add negative count of coins or bills");
        }

        content.put(denom, content.getOrDefault(denom, 0) + count);
    }

    public void putAll(Map<Denomination, Integer> moneyToPut) throws NegativeDenominationCountException {
        for (Denomination denom : moneyToPut.keySet()) {
            put(denom, moneyToPut.get(denom));
        }
    }

    public Integer take(Denomination denom, Integer count) throws NegativeDenominationCountException {
        int currentCount = content.getOrDefault(denom, 0);
        if (currentCount < count) {
            throw new NegativeDenominationCountException("Can not take more from a Denomination than contained");
        }
        if (currentCount == count) {
            return content.remove(denom);
        } else {
            content.put(denom, currentCount - count);
            return count;
        }
    }

    public Integer takeAll(Denomination denom) {
        return content.remove(denom);
    }

    public Map<Denomination, Integer> takeAll() {
        Map<Denomination, Integer> copy = new HashMap<Denomination, Integer>();
        for (Denomination denom : content.keySet()) {
            copy.put(denom, content.remove(denom));
        }
        return copy;
    }

    public Integer getCount(Denomination denom) {
        return content.get(denom);
    }

    public Integer getCount() {
        int count = 0;
        for (Integer cnt : content.values()) {
            count += cnt;
        }
        return count;
    }

    public Integer getValue(Denomination denom) {
        return content.getOrDefault(denom, 0) * denom.getValue();
    }

    public Integer getValue() {
        int value = 0;
        for (Denomination denom : content.keySet()) {
            value += getValue(denom);
        }
        return value;
    }
}
