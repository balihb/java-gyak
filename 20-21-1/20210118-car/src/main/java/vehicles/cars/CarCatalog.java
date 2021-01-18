package vehicles.cars;

import vehicles.cars.engines.Manufacturer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CarCatalog {
    private final Set<Car> cars = new HashSet<>();

    public static Car createCar(String carStr) throws CarException {
        String[] carArr = carStr.split(",");
        return createCar(carArr);
    }

    public static Car createCar(String[] carArr) throws CarException {
        if(carArr.length != 4) {
            throw new CarException("not enough param");
        }
        if(carArr[0].equals("Skoda")) {
                return new Skoda(carArr[1], Manufacturer.valueOf(carArr[2]), Integer.parseInt(carArr[3]));
        } else if (carArr[0].equals("Opel")) {
            return new Skoda(carArr[1], Manufacturer.valueOf(carArr[2]), Integer.parseInt(carArr[3]));
        } else {
            throw new CarException("Unknown car manufacturer");
        }
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCar(String car) throws CarException {
        addCar(createCar(car));
    }

    public void addCar(String[] car) throws CarException {
        addCar(createCar(car));
    }

    public void loadCars(Scanner sc) throws CarException {
        while (sc.hasNextLine()) {
            addCar(sc.nextLine());
        }
    }

    public boolean removeCar(Car car) {
        return cars.remove(car);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car,Type,Engine,Ccm");
        for(Car car : cars) {
            sb.append(System.getProperty("line.separator"));
            sb.append(car.toString());
        }
        return sb.toString();
    }
}
