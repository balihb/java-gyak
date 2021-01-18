package vehicles.cars.engines;

import java.util.*;

public class Engine {
    private final int ccm;
    private final Manufacturer manufacturer;

    public Engine(int ccm, Manufacturer manufacturer) throws InvalidCcmException {
        if (manufacturer == Manufacturer.HONDA && !(ccm == 1800 || ccm == 2100)) {
            throw new InvalidCcmException("HONDA can only be 1800 or 2100");
        } else if (manufacturer == Manufacturer.TOYOTA && !(ccm == 1000 || ccm == 1400)) {
            throw new InvalidCcmException("TOYOTA can only be 1000 or 1400");
        } else if (manufacturer == Manufacturer.HYUNDAI && !(ccm == 1400 || ccm == 1500)) {
            throw new InvalidCcmException("HYUNDAI can only be 1400 or 1500");
        }
        this.ccm = ccm;
        this.manufacturer = manufacturer;
    }


    // alternative solution for storing restrictions

    private static final Map<Manufacturer, Set<Integer>> allowedEngines;

    static {
        Map<Manufacturer, Set<Integer>> allowedEnginesPrep = new EnumMap<>(Manufacturer.class);
        allowedEnginesPrep.put(
                Manufacturer.HONDA,
                Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1800, 2100))));
        allowedEnginesPrep.put(
                Manufacturer.TOYOTA,
                Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1000, 1400))));
        allowedEnginesPrep.put(
                Manufacturer.HYUNDAI,
                Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1400, 1500))));
        allowedEngines = Collections.unmodifiableMap(allowedEnginesPrep);
    }

    public Engine(int ccm, Manufacturer manufacturer, int fake_param) throws InvalidCcmException {
        if (!(allowedEngines.containsKey(manufacturer) && allowedEngines.get(manufacturer).contains(ccm))) {
            throw new InvalidCcmException(manufacturer.name() + " not allows " + ccm);
        }
        this.ccm = ccm;
        this.manufacturer = manufacturer;
    }

    // end of alternative solution

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getCcm() {
        return ccm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return ccm == engine.ccm && manufacturer == engine.manufacturer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ccm, manufacturer);
    }

    @Override
    public String toString() {
        return manufacturer + "," + ccm;
    }
}
