---
title: Programozási Nyelvek Java 2021.01.18. gyakorlati feladatok
lang: hu-HU
strip-comments: true
highlight-style: pygments
...

# Feltételek

- **repl.it** A feladat megoldását a saját repl.it oldalon kell elkészíteni, ami meg van osztva a gyakorlatvezetővel.
- **Mit szabad/tilos?** A gyakorlati ZH során tilos a kommunikáció másokkal minden eszközzel, minden formában. Akiről bebizonyosodik, hogy segítséget akár nyújott, akár kapott, elégtelennel zárja a félévet.
    - A tiltás alól természetesen kivétel, ha a tárgy oktatóihoz van kérdés, amit privát Teams üzenetben lehet a legkönnyebben feltenni.
    - Egyébként segédeszközök felhasználhatók, és a neten is szabad keresni (a ZH kezdete előtt készült tartalmakra).
    - Használható például [a hivatalos Java dokumentáció](https://docs.oracle.com/en/java/javase/15/docs/api/index.html).

# A megoldásról

- **Külalak** A feladatban konkrétan megadott neveket (pl. osztályok, metódusok, adattagok nevei) kötelező pontosan a megadott alakban használni.
    - Segédfüggvényeket szabad felvenni.
    - Az elkészített kód minősége minden szempontból legyen a lehető legjobb.
- **Gyökér** A megoldás a gyökérkönyvtárból "induljon", közvetlenül onnan legyen fordítható.
- **Sorrend** A feladatokat sorban kell megoldani: amíg nincsen készen egy rész megoldása, addig nem kezdhető meg a következő rész.
- **Tesztelő** A legtöbb feladatrészhez tartozik JUnit tesztelő. Ilyen feladatrészre csak akkor kapható teljes pont, ha ezek rendben lefordulnak és lefutnak.
    - A még nem megvalósított részekhez tartozó tesztesetek átmenetileg kikommentezendők.
    - A [mellékelt tesztelőfájlokat](http://exam.inf.elte.hu/exam20210118-car.zip) úgy kell elhelyezni és üzembe helyezni (a beüzemeléshez esetlegesen szükséges kódsorokat hozzáadni), hogy a repl gyökérkönyvtárából lehessen futtatni:

        ~~~bash
        find . -name "*.java" | tr '\n' ' ' | xargs javac -cp .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar
        java -cp .:/run_dir/junit-4.12.jar:/run_dir/hamcrest-core-1.3.jar org.junit.runner.JUnitCore TESZTELŐ_OSZTÁLY_TELJES_MINŐSÍTETT_NEVE
        ~~~


# A ZH menete

- **repl.it** A ZH megkezdésekor ellenőrizd, hogy a repl-ed neve megfelelő-e: **benne van-e a Neptun-kódod**.
    - Ha nem **`PNy_Cs16_NEPTUNKÓDOM`** (*Cs16* helyett a megfelelő időponttal) formátumú a repl neve, nevezd át.
- **Gyakorlatvezető**
    - Amennyiben az alábbi listában nem látod a saját gyakorlatvezetődet, válaszd ki véletlenszerűen az egyiküket (pl. [ennek az oldalnak a használatával](https://www.textfixer.com/tools/random-choice.php)), és küldd el neki **privát Teams chatben** a repl-ed elérhetőségét.
    - A mai ZH-alkalmon a következő gyakorlatvezetők érhetők el:
        - Barnák Péter [iwdifn]
        <!-- - Bárczay Kristóf [bkris19] -->
        - Hámorszky Balázs [i531za]
        - Kitlei Róbert [kitlei]
        - Lizák Viktor [livraat]
        - Mészáros Mónika [bonnie]
        - Nagy Antal [z39j29]
        <!-- - Neuwirth István [pitta] -->
        <!-- - Nok Ádám [noataai] -->
        <!-- - Szilágyi Gyöngyi [gyszilagyi] -->
- **Első fájl** A ZH megkezdése után rögtön készítsd el a megoldáshoz szükséges első forrásfájlt, még tartalom nélkül.
    - Ezután nem sokkal a gyakorlatvezető beleír egy kommentet ebbe a fájlba, ezzel jelzi, hogy hozzáfér a megoldásodhoz. Ha ez a komment nem jelenik meg 10-20 percen belül, feltétlenül jelezd!
- **Kérdések** Ha technikai probléma vagy kérdés merülne fel menet közben, privát Teams üzenetben érdemes kérdezni elsősorban a gyakorlatvezetőtől, másodsorban az előadótól.
- **Idő vége** Amikor lejár a határidő, a gyakorlatvezető letölti a repl.it oldalról a megoldásodat.
    - A határidő szigorú (hosszabbítás nincsen), és a kódnak működnie kell.
    - A gyakorlatvezető a fent említett fájlba beleír egy kommentet arról, hogy letöltötte a megoldást.
- **Utolsó 10 perc** Tipp: a tapasztalatok szerint kb. 10 perc szükséges a megoldás letisztázásához, érdemes ennyivel a határidő előtt befejezni a fejlesztést, és végignézni/kipróbálni/végső alakra hozni a kódot.

# Feladat

A feladat célja egy autókatalógust megvalósító rendszer elkészítése az alábbiak szerint.

1. Segédeszközök (12 pont)

    - Készítsd el a `vehicles.cars.engines.Manufacturer` felsorolási típust. A típus a következő értékeket tartalmazza: `HONDA`, `TOYOTA`, `HYUNDAI`.
        - **Amint elolvastad ezt a mondatot**, készítsd el a megfelelő forrásfájlt, hogy a gyakorlatvezető el tudja benne helyezni a fent említett kommentet.
        - A legelső **tesztesetet** rögtön használd is.
        - Csak ezután folytasd az olvasást.
    - Készítsd el az alábbi három kivétel osztályt.
        - `vehicles.cars.CarException`: kivételként kötelezően kapnia kelljen egyetlen szöveges paramétert példányosításkor.
        - `vehicles.cars.IllegalEngineException`: származzon a `CarException` osztályból. Neki is kötelező legyen a szöveges paraméter példányosításnal.
        - `vehicles.cars.engines.InvalidCcmException`: származzon a `CarException` osztályból. Neki is kötelező legyen a szöveges paraméter példányosításnál.
    - Készítsd el a `vehicles.cars.engines.Engine` osztályt.
        - Az osztálynak legyen két kívülről hozzá nem férhető, a példány létrehozása után nem módosítható adattagja.
            - `ccm`: ez tárolja a köbcentit egész számként
            - `manufacturer`: a motor gyártója. Az előző feladatban létrehozott felsorolásból vehet fel értéket.
        - Az adattagok beállítására biztosítsunk lehetőséget a példány létrehozásakor.
        - Készíts olyan függvényeket, melyek segítségével kívülről csak olvasásra hozzáférést tudunk engedni az adattagokhoz.
        - Biztosítsd, hogy a motorból csak akkor jöhessen létre példány, ha az alábbi három feltétel egyike teljesül a létrehozásánál:
            - `HONDA` és a `ccm`-je `1800` vagy `2100`
            - `TOYOTA` és a `ccm`-je `1000` vagy `1400`
            - `HYUNDAI` és a `ccm`-je `1400` vagy `1500`
            - Ha ez nem teljesül, jelezd a hibát `InvalidCcmException`-el.
    - Készítsd el az egyenlőség vizsgálatához használt és a `hashCode` függvényeket az osztályhoz úgy, hogy az adattagokat vegyék figyelembe.
    - Készítsd el a szöveggé konvertáló metódust úgy, hogy a motor gyártóját (az egyszerűség kedvéért csupa nagy betűvel), majd a köbcentit írja ki vesszővel elválasztva.


1. Autók (6 pont)

    - Hozd létre az alábbi három osztályt.
    - `vehicles.cars.Car`
        - Legyen két adattagja. `type`, ami az autó típusa és szöveg típusú. `engine`, ami `Engine` típusú. Ezek a példány létrehozása után ne legyenek módosíthatóak, de a leszármazottaknak legyen rálátásuk.
        - Létrehozáskor három paramétert várjon el ebben a sorrendben: az autó típusát, a motor gyártóját és a motor köbcentijét.
        - A `Car` osztályból ne lehessen példányokat létrehozni, kizárólag a leszármazottaiból.
    - `vehicles.cars.Skoda`
        - Származzon a `Car` osztályból.
        - Csak akkor lehessen példányt létrehozni belőle, ha `HONDA` vagy `HYUNDA`I motor van benne. Más esetben jelezd a hibát `IllegalEngineException`-el.
    - `vehicles.cars.Opel`
        - Származzon a `Car` osztályból.
        - Csak akkor lehessen példányt létrehozni belőle, ha `HYUNDAI` vagy `TOYOTA` motor van benne. Más esetben jelezd a hibát `IllegalEngineException`-el.
    - Biztosítsd, hogy az itt felsorolt osztályokból, ha példányt hozunk létre, akkor csak akkor lehessenek egyenlőek, ha ugyanahhoz a márkához és típushoz tartoznak és ugyanaz a motor van bennük.
    - A példányok szöveggé konvertálásnál vesszővel elválasztva a következőket írják ki ebben a sorrendben: márka, típus, motorgyártó és köbcenti.

1. Autókatalógus (12 pont)

    - Hozd létre a `vehicles.cars.CarCatalog` osztályt.
    - Adj hozzá úgy `createCar` néven osztályszintű függvényt, hogy az kétféleképpen is meghívható legyen.
        - szöveges tömbbel. Ebben a függvény úgy veszi, hogy a tömb 4 elemű és ebben a sorrendben tartalmazza szöveges elemként a következőket: márkanév, típusnév, motorgyártó és köbcenti. Ezek segítségével létrehoz egy megfelelő `Car` típusú objektumot és ezzel visszatér.
        - egy szöveges paraméterrel. Ebben az esetben az előzőekben leírt sorrendben vesszővel elválasztva kapja meg az elemeket az egyetlen szöveges paraméterben és ebből hozza létre a megfelelő `Car` típusú objektumot.
    - A katalógus autó objektumokat tárol, de nem lehet benne két egyforma autó.
        - Oldd meg a `CarCatalog` szöveggé konvertálását úgy, hogy az a benne tárolt autókat egy több soros szövegként adja vissza úgy, hogy az első sor attól függetlenül, ha van-e a katalógusban auto vagy nem mindig `Car,Type,Engine,Ccm`, az ezután következő sorok pedig az autók szöveges reprezentációi. A sorok elválasztására a `System.getProperty("line.separator")` visszatérési értékét használjuk.
    - Adj hozzá `addCar` néven függvényt úgy, hogy három féle képpen is meghívható legyen.
        - `Car` objektummal. Ebben az esetben a függvény tárolja el az objektumot, ha nem átrolt el olyat, ami egyforma a paraméterrel kapottal.
        - szöveges tömbbel. Ebben az esetben `createCar` ugyan ilyen paraméterével meghívásának leírásában leírt módon értelmezze a tömböt és így tárolja le a az autót. Szintén csak, ha egyedi.
        - egy szöveges paraméter. Az előzőekben leírtakhoz hasonlóan ezt egy autó leírásának tekinti vesszőkkel elválasztva és az ebből kapott autót tárolja le, ha egyedi.
    - Adj hozzá egy `removeCar` metódust, ami egy `Car` típusú paramétert fogad és azt kiszedi a katalógusból.
    - Adj hozzá egy `loadCars` metódust, ami egy `Scanner` típusú paramétert fogad és soronként az autók vesszővel elválasztott reprezentációjának veszi a `Scanner` sorait és azokat hozzáadja a katalógushoz.
