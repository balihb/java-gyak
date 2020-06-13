package game.utils;

public class VehicleException extends Exception // 0.5 pont
{
    /*
    itt lehetséges, de nem kötelező az üres konstruktort meghívni.
    ha nincs explicit definiálva super konstruktor, akkor mindig a paraméter nélküli hívódik meg a leszármazott
    osztály konstruktorában.
    lehetséges olyan eset, hogy egy osztálynak nincs paraméter nélküli konstruktora. ilyenkor mindig kötelező kiírni.
     */
    public VehicleException() // 0.5 pont
    {
    }

    public VehicleException(String msg) {
        super(msg); // 0.5 pont
    }
}

