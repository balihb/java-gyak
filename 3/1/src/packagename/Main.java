package packagename;

public class Main {
    public static void main(String[] args) {
        System.out.println(Foo.alma);
        System.out.println(Foo.getAlma());

        Foo oof = new Foo();

        System.out.println(oof.korte);
        System.out.println(oof.getKorte());

        // lehetséges statikus adattagokat a példányból lekérdezni, de a classból ajánlott
        System.out.println(oof.alma);
        System.out.println(oof.getAlma());
    }
}