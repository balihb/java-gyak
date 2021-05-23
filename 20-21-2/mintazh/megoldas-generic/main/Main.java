package main;

import game.Player;
import game.utils.VehicleColors;
import game.vehicles.Car;
import game.vehicles.Train;
import game.vehicles.Vehicle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Player zorro = loadPlayerFromFile("Zorror");
        Player daniel = loadPlayerFromFile("Daniel");
        //Player peter = loadPlayerFromFile("Peter");
        Player richard = loadPlayerFromFile("Richard");
        Player tamas = loadPlayerFromFile("Tamas");
        //Car c1 = loadPlayerFromFile("Zorro");
        //Car c2 = new Car();
        //Car c3 = new Car();
        //System.out.println(c1);

        Car car1 = new Car(10, 50, "feher");
        Car car2 = new Car(20, 50, "kek");
        Car car3 = new Car(20, 100, "kek");
        Train train1 = new Train("kek");

        VehicleColors<Vehicle> vc = new VehicleColors<>();
        vc.add(car1);
        vc.add(car2);
        vc.add(car3);
        vc.add(train1);

        VehicleColors<Car> cc = new VehicleColors<>();
        cc.add(car1);
        cc.add(car2);
        cc.add(car3);

        System.out.println(vc.getColors());
    }

    public static Player loadPlayerFromFile(String playerName) {
        File input = new File("users/" + playerName + ".txt");

        String[] data = null;
        try (BufferedReader bf = new BufferedReader(new FileReader(input))) {
            String line = bf.readLine();
            data = line.split(" ");

            return new Player(playerName, data[0], Integer.valueOf(data[1]));
        } catch (IOException e) {
            System.out.println("IO error occured: " + e.getMessage());
        } catch (NumberFormatException e) {
            return new Player(playerName, data[0], 0);
        }

        return null;
    }

}