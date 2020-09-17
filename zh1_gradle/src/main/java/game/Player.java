package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import game.vehicles.Car;
import game.utils.VehicleException;


public class Player {
    // 1 pont (adattagok, getter, láthatóság)
    private String name, ip;
    private int money;
    private ArrayList<Car> cars;

    /*
    Bár lehetőséget ad arra a Java, hogy bármelyik metódust kis-nagy betűvel kezdjünk,
    de a konvenció, hogy a Constructor kezdődik nagybetűvel kizárólag
    (a Constructor neve meg kell, hogy egyezzen az osztály nevével és az osztályok neve szintén konvenció szerint
    nagybetűvel kell, hogy kezdődjön),
    a többi függvény kisbetűvel kezdődik és camel-case-elve van:
    https://en.wikipedia.org/wiki/Camel_case
     */
    public int getMoney() {
        return money;
    }

    public Player(String name, String ip, int money) {
        if (name == null || ip == null || ip.length() <= 0 || money < 0) // 1 pont
        {
            throw new IllegalArgumentException();
        }

        /*
        Ez a kódrészlet több eshetőséget fed le, mint ami a zh szövegében szerepelt.
        "Az IP-cím akkor megfelelő, ha nem null referencia és a hossza pozitív, valamint nem tartalmaz fehér szóközt (whitespace: szóköz, tabulátor, sorvége)."
        https://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#isWhitespace(char)
         */
        for (int i = 0; i < ip.length(); ++i) {
            if (Character.isWhitespace(ip.charAt(i))) // 1 pont
            {
                throw new IllegalArgumentException();
            }
        }
        /*
        Valid megoldások voltak még a következők
         */
        /*
         csak a karakterekkel amiket a kérdés kért
         */
        if (ip.contains(" ") || ip.contains("\n") || ip.contains("\t")) {
            throw new IllegalArgumentException();
        }

        /*
         reguláris kifejezésekkel
         */
        if (ip.matches(".*\\s.*")) {
            throw new IllegalArgumentException();
        }

        /*
        Pár esetben láttam olyan megoldást, hogy a konstruktor megkapta a paramétereket,
        de az objektum mezői nem lettek kitöltve.
        Attól, hogy a konstruktor paraméterének neve egyezik az objektum egyik mezőjével,
        még nem lesz a mező értéke arra beállítva.
        Pár zh-ban láttam, hogy a mezők _ karakterrel kezdődtek, hogy ne kelljen kiírni a this.-ot.
        Ugyan ez lehetséges, de Java-ban inkább this.-al szokás megnevezni a példány mezőit.
         */
        // 1 pont
        this.name = name;
        this.ip = ip;
        this.money = money;
        this.cars = new ArrayList<Car>();
    }

    @Override
    public String toString() {
        return name + ": " + ip + ", money: " + money;
    }

    /*
    az @Override esetében (amikor felülírunk egy függvényt) a függvény visszatérési értéke,
    neve és paraméterei is meg kell, hogy egyezzenek a felülírttal (a függvény szignatúrája).
    Pár zh-ban a that Player-ként szerepelt.
    Az equals paramétere mindig a lehető legtágabb Object kell, hogy legyen. Nem csak azért, mert a felülírt metódus
    paramétere Object és emiatt ha felül írjuk, akkor meg kell egyeznia a függvény szignatúrájának, de a Java-ban
    minden objektum összehasonlítható a másikkal. Akkor is, ha más típusúak.
     */
    @Override
    public boolean equals(Object that) // 0.5 pont
    {
        if (that == null) return false;
        if (that == this) return true;

        /*
         az instanceof az adott objektum álltal implementált interface-ekre is is true-t ad vissza,
         mivel annak az interface-nek is az instance-a az adott objektum
         */
        if (that instanceof Player) // 1 pont
        {
            Player thatPlayer = (Player) that;
            return this.name.equals(thatPlayer.name) && this.money == thatPlayer.money && this.cars.equals(thatPlayer.cars); // 1 pont
        } else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money, cars); // 1 pont
    }

    public void buyCar(Car car) throws VehicleException {
        if (money < car.getCost()) // 0.5 pont
        {
            throw new VehicleException("buyCar(): player doesnt have enough money");
        }
        if (car.getOwner() != null) // 0.5 pont
        {
            throw new VehicleException("buyCar(): car already has an owner");
        }

        // 1 pont
        car.setOwner(this);
        cars.add(car);
        money -= car.getCost();
    }

    /*
    Itt fontos, hogy a használt collection sorrend tartó legyen.
     */
    public ArrayList<Car> getSortedCars() {
        ArrayList<Car> sortedCars = new ArrayList<Car>(cars); // 1 pont
        /*
        maga a collection kerül átrendezésre, nem egy rendezett másolat készül belőle
         */
        Collections.sort(sortedCars);
        return sortedCars;
    }
}

