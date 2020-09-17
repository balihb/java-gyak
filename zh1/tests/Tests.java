package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import game.Player;
import game.vehicles.Car;
import game.vehicles.Train;
import game.utils.VehicleException;


// TC-nként 0.5 pont, összesen 6 pont
public class Tests {
    public static final double EPSILON = 0.01;

    // exc1
    @Test(expected = IllegalArgumentException.class)
    public void Player_ctorNullName() {
        new Player(null, "127.0.0.1", 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Player_ctorNegMoney() {
        new Player("Peter", "127.0.0.1", -10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Player_ctorWs() {
        new Player("Peter", "127 0 0 1", 10);
    }

    @Test
    public void Player_ctorSuccess() {
        Player player = new Player("Peter", "127.0.0.1", 502);
        assertEquals(502, player.getMoney());
    }

    /*
    az epsion az itt demonstrált probléma miatt szükséges:
    https://github.com/balihb/java-gyak/blob/master/1/0/big-decimal/src/BigDecimalTest.java
    a main kimenete a következő:
    1.56
    1.560000000000000053290705182007513940334320068359375
    Az 1.56 double bináris reprezentációja a második sor, de a kiíratásnál a println levágja a "fölös" részt,
    de ettől nem garantált, hogy a két érték egyenlő lesz.
    A tört számok megszámlálhatatlanul végtelenek, ezért az ábrázolásuknál ki kell választanunk a számegyeneseken pontokat,
    amiket tudunk reprezentálni, tehát két látszólag egyező számnak lehet más a bináris reprezentációja.
     */
    @Test
    public void Car_accelerate() throws VehicleException {
        Car car = new Car(300, 60);
        assertEquals(0, car.getCurrentSpeed(), EPSILON);
        car.accelerate(20);
        assertEquals(20, car.getCurrentSpeed(), EPSILON);
        car.accelerate(-10);
        assertEquals(10, car.getCurrentSpeed(), EPSILON);
    }

    @Test
    public void Car_accelerateMaxSpeed() throws VehicleException {
        Car car = new Car(300, 60);
        assertEquals(0, car.getCurrentSpeed(), EPSILON);
        car.accelerate(20);
        car.accelerate(290);
        assertEquals(20, car.getCurrentSpeed(), EPSILON);
    }

    @Test(expected = VehicleException.class)
    public void Car_accelerateUnderNeg() throws VehicleException {
        Car car = new Car(300, 60);
        assertEquals(0, car.getCurrentSpeed(), EPSILON);
        car.accelerate(20);
        assertEquals(20, car.getCurrentSpeed(), EPSILON);
        car.accelerate(-100);
    }

    // exc2
    @Test
    public void Player_equalNotSameIP() {
        Player p1 = new Player("Peter", "127.0.0.1", 100);
        Player p2 = new Player("Peter", "127.0.0.2", 100);
        assertTrue(p1.equals(p2));
    }

    @Test
    public void Player_sameHashcodeWhenEquals() {
        Player p1 = new Player("Peter", "127.0.0.1", 100);
        Player p2 = new Player("Peter", "127.0.0.2", 100);
        assertTrue(p1.hashCode() == p2.hashCode());
    }

    // exc3
    @Test
    public void Car_compareToTransitive() {
        Car a = new Car(200, 100);
        Car b = new Car(250, 300);
        Car c = new Car(250, 400);
        assertTrue(0 > a.compareTo(b));
        assertTrue(0 > b.compareTo(c));
        assertTrue(0 > a.compareTo(c));
    }

    @Test(expected = VehicleException.class)
    public void Player_buyCarNotEnoughMoney() throws VehicleException {
        Player player = new Player("Peter", "127.0.0.1", 100);
        Car car = new Car(300, 101);
        player.buyCar(car);
    }

    @Test(expected = VehicleException.class)
    public void Player_buyCarAlreadyOwnedCar() throws VehicleException {
        Player player = new Player("Peter", "127.0.0.1", 1000);
        Car car = new Car(300, 100);
        player.buyCar(car);
        player.buyCar(car);
    }
}
