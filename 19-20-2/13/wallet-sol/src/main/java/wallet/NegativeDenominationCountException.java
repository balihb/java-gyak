package wallet;

public class NegativeDenominationCountException extends Exception {
    NegativeDenominationCountException(String msg) {
        super(msg);
    }
}
