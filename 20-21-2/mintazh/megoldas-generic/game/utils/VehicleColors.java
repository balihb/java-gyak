package game.utils;

import game.vehicles.Vehicle;

import java.util.HashSet;
import java.util.Set;

public class VehicleColors<T extends Vehicle> {
    private final Set<String> colors = new HashSet<>();

    public void add(T v) {
        colors.add(v.getColor());
    }

    public Set<String> getColors() {
        return new HashSet<>(colors);
    }
}
