// https://www.geeksforgeeks.org/static-keyword-java/
// https://www.geeksforgeeks.org/static-class-in-java/

public class StaticMain {
    static int alma = 1;
    int korte = 2;

    static int getAlma() {
        return alma;
    }

    int getKorte() {
        return korte;
    }

    int almaPlusKorte() {
        return alma + korte;
    }

    public static void main(String[] args) {
        System.out.println(StaticMain.alma);
        // Non-static field 'korte' cannot be referenced from a static context
        //System.out.println(StaticMain.korte);
        StaticMain sm = new StaticMain();
        System.out.println(sm.korte);
    }
}
