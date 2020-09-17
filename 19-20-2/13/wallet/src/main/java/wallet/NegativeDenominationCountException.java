package wallet;

public class NegativeDenominationCountException extends Exception {
    public NegativeDenominationCountException(String msg) {
        super(msg);
    }
}
