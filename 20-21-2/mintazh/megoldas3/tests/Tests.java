package tests;

import game.Player;
import game.utils.VehicleException;
import game.vehicles.Car;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void differentIpPlayer() {
        Player p1 = new Player("Bela", "192.168.1.1", 10);
        Player p2 = new Player("Bela", "192.168.1.2", 10);
        assertEquals(p1, p2);
    }

    @Test
    public void equalHashPlayer() {
        Player p1 = new Player("Bela", "192.168.1.1", 10);
        Player p2 = new Player("Bela", "192.168.1.2", 10);
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void transitiveCars() {
        Car car1 = new Car(10,50);
        Car car2 = new Car(20,50);
        Car car3 = new Car(20,100);

        assertTrue(car1.compareTo(car2) < 0);
        assertTrue(car2.compareTo(car3) < 0);
        assertTrue(car1.compareTo(car3) < 0);
        assertTrue(car3.compareTo(car2) > 0);
        assertTrue(car2.compareTo(car1) > 0);
        assertTrue(car3.compareTo(car1) > 0);
    }

    @Test(expected = VehicleException.class)
    public void throwsExcBuy() throws VehicleException {
        Car car1 = new Car(10,5);
        Player p1 = new Player("Bela", "192.168.1.1", 10);
        Player p2 = new Player("Bela", "192.168.1.2", 10);

        p1.buyCar(car1);
        p2.buyCar(car1);
    }

    @Test(expected = VehicleException.class)
    public void throwsExcBuyMoney() throws VehicleException {
        Car car1 = new Car(10,50);
        Player p1 = new Player("Bela", "192.168.1.1", 10);

        p1.buyCar(car1);
    }
}
