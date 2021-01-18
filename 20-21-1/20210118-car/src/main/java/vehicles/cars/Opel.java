package vehicles.cars;

import vehicles.cars.engines.Manufacturer;

import java.util.Objects;

public class Opel extends Car {
    public Opel(String type, Manufacturer manufacturer, int ccm) throws CarException {
        super(type, manufacturer, ccm);
        if (!(manufacturer == Manufacturer.HYUNDAI || manufacturer == Manufacturer.TOYOTA)) {
            throw new IllegalEngineException("Opel must use Hyundai or Toyota");
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash("Opel", type, engine);
    }

    @Override
    public String toString() {
        return "Opel," + super.toString();
    }
}
