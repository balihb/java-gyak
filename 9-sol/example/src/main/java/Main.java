public class Main {
    public static void main(String[] args) {
        Vas vasObj;
        vasObj = new Vas(1);

        Korfuresz korfureszObj1;
        korfureszObj1 = new Korfuresz();

        Korfuresz korfureszObj2;
        korfureszObj2 = new Korfuresz(2, 3);

        Vas vasObj2 = new Korfuresz(4, 5);

        System.out.println(vasObj.SOME_STATIC_STRING);
        System.out.println(korfureszObj1.SOME_STATIC_STRING);

        System.out.println(Vas.SOME_STATIC_STRING);
        System.out.println(Korfuresz.SOME_STATIC_STRING);

        System.out.println(vasObj);
        System.out.println(korfureszObj2);
        System.out.println(vasObj2);

        System.out.println((Vas) korfureszObj2);

        System.out.println(vasObj2);

        System.out.println(vasObj2.getAlma());

        System.out.println(korfureszObj2.getAlma());
        System.out.println(korfureszObj2.getKorte());

        // vasObj2.getKorte(); // nem működik, mert a referenciánk Vas típusú
    }
}
