package vehicles.cars.engines;

import vehicles.cars.CarException;

public class InvalidCcmException extends CarException {
    public InvalidCcmException(String msg) {
        super(msg);
    }
}
