package game.vehicles;

import game.utils.VehicleException;


public abstract class Vehicle {
    /*
    Ökölszabály szerint minden adattagot alapból privátra állítunk.
     */
    // 1 pont (adattagok, getter, láthatóság, konstruktor)
    private static int currentId = 0;
    /*
    A protected helyett használhatnánk private adattagot egy getterrel, amit a leszármazotban hívunk.
     */
    protected final int id;
    private double currentSpeed;

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    protected Vehicle() {
        this.id = currentId++; // 1 pont
    }

    protected final void accelerateCurrentSpeed(double amount) throws VehicleException {
        if (currentSpeed + amount < 0) // 1 pont
        {
            throw new VehicleException("accelerate(): invalid amount");
        }
        currentSpeed += amount;
    }

    public abstract void accelerate(double amount) throws VehicleException; // 1 pont

    /*
    sok esetben láttam az accelerate-t throws nélkül
    ami nagyon fontos, hogy a leszármazottban implementált metódus dobhat kevesebb exception-t az ős felülírt metódusánál,
    de többet nem.
    ugyan ennek az osztálynak a specifikációjában nem szerepelt az exception, de a Car és Train-nél igen,
    ezért itt kell szerepelnie az exception dobásának
     */

    /*
    ennek láttam olyan változatát is, ahol nem abstract szerepelt előtte, hanem utána egy {} (üres kapcsos),
    "A Vehicle osztálynak legyen végül egy implementáció nélküli, nyilvános accelerate() metódusa"
    Üres kapcsos esetény viszont van implementációja, annak ellenére, hogy az nem tartalmaz utasításokat.
     */
}

