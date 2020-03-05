package otherpackage;

import packagename.Bar;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(Bar.alma);
        System.out.println(Bar.getAlma());

        Bar obj = new Bar();

        System.out.println(Bar.getKorte());
        System.out.println(Bar.korte);

        System.out.println(obj.korte);
        System.out.println(obj.getKorte());

        // lehetséges statikus adattagokat a példányból lekérdezni, de a classból ajánlott
        System.out.println(obj.alma);
        System.out.println(obj.getAlma());

        System.out.println(Bar.banan);
        System.out.println(Bar.getBanan());

        System.out.println(obj.banan);
        System.out.println(obj.getBanan());

        System.out.println(Bar.narancs);
        System.out.println(Bar.getNarancs());

        System.out.println(obj.narancs);
        System.out.println(obj.getNarancs());
    }
}
