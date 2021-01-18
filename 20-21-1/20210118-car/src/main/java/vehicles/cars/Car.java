package vehicles.cars;

import vehicles.cars.engines.Engine;
import vehicles.cars.engines.InvalidCcmException;
import vehicles.cars.engines.Manufacturer;

public abstract class Car {
    protected final String type;
    protected final Engine engine;

    protected Car(String type, Manufacturer manufacturer, int ccm) throws InvalidCcmException {
        this.type = type;
        this.engine = new Engine(ccm, manufacturer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return type.equals(car.type) && engine.equals(car.engine);
    }

    @Override
    public String toString() {
        return type + "," + engine;
    }
}
