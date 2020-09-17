# Pénztárca

Pénztárcát implementálunk.

## Címletek

Első lépés a címletek.
Idő spórolás céljából használd a következő enum osztályt:

```java
package money;

public enum Denomination {
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    ONE_HUNDRED(100),
    TWO_HUNDRED(200),
    FIVE_HUNDRED(500),
    ONE_THOUSAND(1000),
    TWO_THOUSAND(2000),
    FIVE_THOUSAND(5000),
    TEN_THOUSAND(10000),
    TWENTY_THOUSAND(20000);

    private final int value;

    Denomination(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
```

## Összehasonlíthatóság

Két pénztárcának összehasonlíthatónak tehát rendezhetőnek kell lennie érték szerint, tehát a pénztárca implementálja a Comparable interface-t.

### Comparable

A Comparable intefrace elvárása annyi, hogy legyen egy compareTo függvény az osztályon.
Mivel a metódus nem statikus, ezért egy példányon hívjuk meg.
Ha a példány amin hívjuk magasabb az összehasonlított példánynál, akkor 1-el kell visszatérnie.
Ha alacsonyabb -1-el.
Ha egyenlő, akkor 0-val.
Ezek az összehasonlítások nem csak numerikusak lehetnek. Az összeshasonlítás szempontja változhat a problémahalmaz (domain) alapján.

### Wallet

```java
package wallet;

public class Wallet implements Comparable<Wallet> {
        @Override
        public int compareTo(Wallet otherWallet) {
            // a feladat lényege ennek a visszatérési értéknek a helyes visszaadása lesz a 0 helyett
            return 0;
        }
}
```

A Wallet osztály saját magával összehasonlítható.

### Belső adatszerkezet

A pénztárca egy Map-ben tárolja az adott címletekhez tartozó mennyiséget (Denomination -> Integer).
```java
private final Map<Denomination, Integer> content = new HashMap<Denomination, Integer>();
```

Minden pénztárca üresen kezd (később majd írunk konstruktort ami alapból feltölti).

## Pénzt rakunk bele

Egy pénztárcába kell tudnunk pénzt rakni.
Írjunk egy `put` metódust, ami vár egy címletet (Denomination) és egy értéket, amennyit berakunk.

### Negatív "kifogás"

Figyeljünk oda, hogy az érték ne lehessen negatív.
Erre az esetre írjunk egy `NegativeDenominationCountException` osztályt.
Legyen legalább egy konstruktora, ami egy üzenetet vár.

## Több címletet egyszerre rakunk bele

Írjunk egy függvényt `putAll` néven, ami egy `Map<Denomination, Integer>` szignatúrájú paramétert vár el
és a paraméterként kapott Map-et hozzá adja a tárcához.

## Inicializáló konstruktor

Az előző függvény felhasználásával készítsünk egy konstruktort, ami feltölti a pénztércét értékekkel alapból.

## Értékek lekérdezés címletre

Adjunk hozz egy függvényt `getValue` néven, ami lekérdezi a pénztárca értékét egy adott címletre.

## Összérték lekérdezése

Az előző függvényt felhasználva készítsünk egy paraméter nélküli `getValue` függvényt, ami megmondja a pénztárca teljes értékét.

# Tesztelés

## Időspórolás

Fogjuk a következő teszt osztályt:
```java
package wallet;

import money.Denomination;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static money.Denomination.*;

public class WalletTest {
    Wallet bigWallet;
    Wallet smallWallet;
    Wallet smallWallet2;
    List<Wallet> walletsNotOrdered;
    List<Wallet> walletsOrdered;
    List<Wallet> walletsOrdered2;

    @Before
    public void init() throws NegativeDenominationCountException {
        Map<Denomination, Integer> bwCont = new HashMap<Denomination, Integer>();
        bwCont.put(TWENTY_THOUSAND, 2);
        bwCont.put(FIVE, 4);

        Map<Denomination, Integer> swCont = new HashMap<Denomination, Integer>();
        swCont.put(TWENTY, 10);
        swCont.put(ONE_HUNDRED, 2);
        swCont.put(TWO_THOUSAND, 2);

        bigWallet = new Wallet(bwCont);
        smallWallet = new Wallet(swCont);
        smallWallet2 = new Wallet(swCont);

        walletsNotOrdered = new ArrayList<Wallet>();
        walletsNotOrdered.add(smallWallet);
        walletsNotOrdered.add(bigWallet);
        walletsNotOrdered.add(smallWallet2);

        walletsOrdered = new ArrayList<Wallet>();
        walletsOrdered.add(smallWallet);
        walletsOrdered.add(smallWallet2);
        walletsOrdered.add(bigWallet);

        walletsOrdered2 = new ArrayList<Wallet>();
        walletsOrdered2.add(smallWallet2);
        walletsOrdered2.add(smallWallet);
        walletsOrdered2.add(bigWallet);
    }

    @Test
    public void compareBigSamll() {
        Assert.assertTrue(bigWallet.compareTo(smallWallet) == 1);
    }

    @Test
    public void compareSmallBig() {
        Assert.assertTrue(smallWallet.compareTo(bigWallet) == -1);
    }

    @Test
    public void compareSmallSmall() {
        Assert.assertTrue(smallWallet.compareTo(smallWallet) == 0);
    }

    @Test
    public void compareSmallSmall2() {
        Assert.assertTrue(smallWallet.compareTo(smallWallet2) == 0);
    }

    @Test
    public void compareOrdered() {
        Assert.assertEquals(walletsOrdered, walletsOrdered2);
    }

    @Test
    public void compareNotOrdered() {
        Assert.assertNotEquals(walletsOrdered, walletsNotOrdered);
    }

    @Test
    public void compareAfterOrder() {
        Collections.sort(walletsNotOrdered);
        Assert.assertEquals(walletsOrdered, walletsNotOrdered);
    }
}
```

A `@Before` minden teszt előtt lefut.
Bármit módosítunk a teszt közben a példány változóin, a következő teszt előtt felül írja.

### static import

Írjuk át a teszt osztályt úgy, hogy ne kelljen az Assert-et mindig kiírni. 

## Minden fail-el

Ebben a pillanatban mindennek fail-elnie kell. Javítsuk meg.

## equals

Adjunk hozzá egy `equals` és egy `hashCode` metódust.

Mivel egyetlen adattag van, ezért a `hashCode` lehet annak a hashCode-ja.

## compareTo

Írjuk meg a `compareTo`-t az `equals` és a `getValue` segítségével.

## Menjenek át a tesztek

És értsük meg, hogy hogy működnek

# Rendezés

`Collection.sort`

Mindenképpen List-et vár el.
Módosítja az adatszerkezetet.
