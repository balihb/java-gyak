/*

Készítsünk programot, amely bekér két egész számot, és kiírja a köztük lévő egész számok felét. A beolvasás során kapott sztringeket egész számmá az alábbi konverziós függvénnyel alakíthatjuk át.

Integer.parseInt(...)


 */

class Hat {
    public static void main(String[] args) {
        String szamEgy = System.console().readLine();
        Integer szamEgyInt = Integer.parseInt(szamEgy);

        String szamKetto = System.console().readLine();
        int szamKettoInt = Integer.parseInt(szamKetto);

        int alja = 0;
        int teteje = 0;
        if (szamEgyInt < szamKettoInt) {
            alja = szamEgyInt;
            teteje = szamKettoInt;
        } else {
            alja = szamKettoInt;
            teteje = szamEgyInt;
        }

        for (int i = alja; i < teteje; i++) {
            System.out.println(i / 2.0);
        }
    }
}
