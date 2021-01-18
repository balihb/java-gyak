package vehicles.cars.test;

import org.junit.Test;
import vehicles.cars.*;
import vehicles.cars.engines.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class CarsTest {

    // Motorgyártók felsorolása

    /*

    @Test
    public void enumTest() {
        assertEquals("HONDA", Manufacturer.HONDA.name());
        assertEquals("HYUNDAI", Manufacturer.HYUNDAI.name());
        assertEquals("TOYOTA", Manufacturer.TOYOTA.name());
    }

    */

    // Kivételek elkészítése

    /*

    @Test(expected = CarException.class)
    public void carException() throws CarException {
        throw new CarException("dummy exception throw");
    }

    @Test(expected = CarException.class)
    public void illegalEngineException() throws CarException {
        throw new IllegalEngineException("dummy exception throw");
    }

    @Test(expected = CarException.class)
    public void invalidCcmException() throws CarException {
        throw new InvalidCcmException("dummy exception throw");
    }

     */

    // Motor elkészítése

    /*

    @Test
    public void engine() throws InvalidCcmException {
        Engine eng = new Engine(1400, Manufacturer.HYUNDAI);
        assertTrue(eng.getCcm() == 1400);
        assertEquals(Manufacturer.HYUNDAI, eng.getManufacturer());
    }

    @Test
    public void engine2() throws InvalidCcmException {
        Engine eng = new Engine(1000, Manufacturer.TOYOTA);
        assertTrue(eng.getCcm() == 1000);
        assertEquals(Manufacturer.TOYOTA, eng.getManufacturer());
    }

     */

    // Motor segédfüggvények

    /*

    @Test
    public void engineToString() throws InvalidCcmException {
        assertEquals("TOYOTA,1000", new Engine(1000, Manufacturer.TOYOTA).toString());
    }

    @Test
    public void engineEquals() throws InvalidCcmException {
        assertEquals(new Engine(1400, Manufacturer.TOYOTA), new Engine(1400, Manufacturer.TOYOTA));
    }

    @Test
    public void engineNotEqualsNull() throws InvalidCcmException {
        assertNotEquals(new Engine(1400, Manufacturer.TOYOTA), null);
    }

    @Test
    public void engineNotEqualsObject() throws InvalidCcmException {
        assertNotEquals(new Engine(1400, Manufacturer.TOYOTA), new Object());
    }

    @Test
    public void engineNotEqualsAnotherCcm() throws InvalidCcmException {
        assertNotEquals(new Engine(1400, Manufacturer.TOYOTA), new Engine(1000, Manufacturer.TOYOTA));
    }

    @Test
    public void engineNotEqualsAnotherManufacturer() throws InvalidCcmException {
        assertNotEquals(new Engine(1400, Manufacturer.TOYOTA), new Engine(1400, Manufacturer.HYUNDAI));
    }

    @Test
    public void engineHashCode() throws InvalidCcmException {
        assertEquals(new Engine(2100, Manufacturer.HONDA), new Engine(2100, Manufacturer.HONDA));
    }

    */

    // Motor megkötések

    /*

    @Test(expected = InvalidCcmException.class)
    public void badEngineHyundai() throws InvalidCcmException {
        new Engine(1800, Manufacturer.HYUNDAI);
    }

    @Test(expected = InvalidCcmException.class)
    public void badEngineHonda() throws InvalidCcmException {
        new Engine(2000, Manufacturer.HONDA);
    }

    @Test(expected = InvalidCcmException.class)
    public void badEngineToyota() throws InvalidCcmException {
        new Engine(1300, Manufacturer.TOYOTA);
    }

     */


    // Autók elkészítése

    /*

    @Test
    public void skodaIsCar() throws CarException {
        assertTrue(new Skoda("Octavia", Manufacturer.HYUNDAI, 1400) instanceof Car);
    }

    @Test
    public void opelIsCar() throws CarException {
        assertTrue(new Opel("Astra", Manufacturer.TOYOTA, 1000) instanceof Car);
    }

    @Test
    public void skodaToString() throws CarException {
        assertEquals("Skoda,Superb,HONDA,2100", new Skoda("Superb", Manufacturer.HONDA, 2100).toString());
    }

    @Test
    public void opelToString() throws CarException {
        assertEquals("Opel,Vectra,TOYOTA,1400", new Opel("Vectra", Manufacturer.TOYOTA, 1400).toString());
    }

    @Test
    public void opelNotEqualToSkoda() throws CarException {
        assertNotEquals(new Skoda("Fake", Manufacturer.HYUNDAI, 1400), new Opel("Fake", Manufacturer.HYUNDAI, 1400));
    }

    @Test
    public void skodaEqualToSkoda() throws CarException {
        assertEquals(new Skoda("Fake", Manufacturer.HYUNDAI, 1400), new Skoda("Fake", Manufacturer.HYUNDAI, 1400));
    }

    @Test
    public void skodaNotEqualToSkoda() throws CarException {
        assertNotEquals(new Skoda("Fake", Manufacturer.HYUNDAI, 1400), new Skoda("Fake", Manufacturer.HYUNDAI, 1500));
    }

    @Test
    public void skodaHashCodeEqualToSkoda() throws CarException {
        assertTrue(new Skoda("Fake", Manufacturer.HYUNDAI, 1400).hashCode() == new Skoda("Fake", Manufacturer.HYUNDAI, 1400).hashCode());
    }

    @Test
    public void opelHashCodeNotEqualToSkoda() throws CarException {
        assertFalse(new Skoda("Fake", Manufacturer.HYUNDAI, 1400).hashCode() == new Opel("Fake", Manufacturer.HYUNDAI, 1400).hashCode());
    }

    @Test(expected = IllegalEngineException.class)
    public void opelIllegalEngine() throws CarException {
        new Opel("Fake", Manufacturer.HONDA, 2100);
    }

    @Test(expected = IllegalEngineException.class)
    public void skodaIllegalEngine() throws CarException {
        new Skoda("Fake", Manufacturer.TOYOTA, 1000);
    }

     */

    // Auto katalógus segédfüggvények

    /*

    @Test
    public void createCarFromArray() throws CarException {
        assertEquals(CarCatalog.createCar(new String[]{"Skoda", "Fake", "HYUNDAI", "1400"}), new Skoda("Fake", Manufacturer.HYUNDAI, 1400));
    }

    @Test
    public void createCarFromString() throws CarException {
        assertEquals(CarCatalog.createCar("Skoda,Fake,HYUNDAI,1400"), new Skoda("Fake", Manufacturer.HYUNDAI, 1400));
    }

     */

    // Auto katalógus

    /*

    @Test
    public void addCarFromArray() throws CarException {
        CarCatalog cat = new CarCatalog();
        cat.addCar(new String[]{"Skoda", "Fake", "HYUNDAI", "1400"});
        assertEquals(
                String.join(
                        System.getProperty("line.separator"),
                        "Car,Type,Engine,Ccm",
                        "Skoda,Fake,HYUNDAI,1400"),
                cat.toString());
    }

    @Test
    public void addCarFromString() throws CarException {
        CarCatalog cat = new CarCatalog();
        cat.addCar("Skoda,Fake,HYUNDAI,1400");
        assertEquals(
                String.join(
                        System.getProperty("line.separator"),
                        "Car,Type,Engine,Ccm",
                        "Skoda,Fake,HYUNDAI,1400"),
                cat.toString());
    }

    @Test
    public void addMultipleCarFromString() throws CarException {
        CarCatalog cat = new CarCatalog();
        cat.addCar("Skoda,Fake,HYUNDAI,1400");
        cat.addCar("Skoda,Fake2,HYUNDAI,1400");

        List<String> expected = Arrays.asList(
                "Car,Type,Engine,Ccm",
                "Skoda,Fake,HYUNDAI,1400",
                "Skoda,Fake2,HYUNDAI,1400");
        Collections.sort(expected);

        List<String> actual = Arrays.asList(cat.toString().split(System.getProperty("line.separator")));
        Collections.sort(actual);

        assertEquals(expected, actual);
    }

    @Test
    public void addRemoveCarFromString() throws CarException {
        CarCatalog cat = new CarCatalog();
        cat.addCar("Skoda,Fake,HYUNDAI,1400");
        cat.addCar("Skoda,Fake2,HYUNDAI,1400");
        cat.removeCar(CarCatalog.createCar("Skoda,Fake2,HYUNDAI,1400"));

        assertEquals(
                String.join(
                        System.getProperty("line.separator"),
                        "Car,Type,Engine,Ccm",
                        "Skoda,Fake,HYUNDAI,1400"),
                cat.toString());
    }

    @Test
    public void loadCarsFromString() throws CarException {
        String carsStr = String.join(
                System.getProperty("line.separator"),
                "Skoda,Fake,HYUNDAI,1400",
                "Skoda,Fake2,HYUNDAI,1400");

        CarCatalog cat = new CarCatalog();
        Scanner sc = new Scanner(carsStr);
        cat.loadCars(sc);
        sc.close();

        List<String> expected = Arrays.asList(
                "Car,Type,Engine,Ccm",
                "Skoda,Fake,HYUNDAI,1400",
                "Skoda,Fake2,HYUNDAI,1400"
        );
        Collections.sort(expected);

        List<String> actual = Arrays.asList(cat.toString().split(System.getProperty("line.separator")));
        Collections.sort(actual);

        assertEquals(expected, actual);
    }

     */
}
