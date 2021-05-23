package tests;

import game.Player;
import game.utils.VehicleException;
import game.vehicles.Car;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    private static double EPSILON = 0.01;

    @Test(expected = IllegalArgumentException.class)
    public void nullNamePlayer() {
        new Player(null, "192.168.1.1", 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negMoneyPlayer() {
        new Player("ertelmes", "192.168.1.1", -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void spaceIpPlayer() {
        new Player("ertelmes", "192.168.1. 1", 5);
    }

    @Test
    public void accelCar() throws VehicleException {
        Car car = new Car(50, 50);
        double cs = car.getCurrentSpeed();
        car.accelerate(20);
        assertTrue(cs < car.getCurrentSpeed());

        cs = car.getCurrentSpeed();
        car.accelerate(-20);
        assertTrue(cs > car.getCurrentSpeed());
    }

    @Test
    public void maxSpeedCar() throws VehicleException {
        Car car = new Car(50,50);
        car.accelerate(50);
        double cs = car.getCurrentSpeed();
        car.accelerate(25);
        assertEquals(cs, car.getCurrentSpeed(), EPSILON);
    }

    @Test(expected = VehicleException.class)
    public void negativeSpeed() throws VehicleException {
        new Car(10, 50).accelerate(-10.1);
    }
}
