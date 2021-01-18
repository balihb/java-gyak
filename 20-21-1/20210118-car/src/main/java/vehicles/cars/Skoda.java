package vehicles.cars;

import vehicles.cars.engines.Manufacturer;

import java.util.Objects;

public class Skoda extends Car {
    public Skoda(String type, Manufacturer manufacturer, int ccm) throws CarException {
        super(type, manufacturer, ccm);
        if (!(manufacturer == Manufacturer.HONDA || manufacturer == Manufacturer.HYUNDAI)) {
            throw new IllegalEngineException("Skoda must use Honda or Hyundai");
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash("Skoda", type, engine);
    }

    @Override
    public String toString() {
        return "Skoda," + super.toString();
    }
}
