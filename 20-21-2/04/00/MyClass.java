public class MyClass {
    private int asdf;

    private static int asdf2;

    private static int sorszamGlobalis = 0;
    private int sajatSorszam;

    public MyClass(int asdf) {
        this.asdf = asdf;
        sorszamGlobalis += 1;
        sajatSorszam = sorszamGlobalis;
    }

    public int getAsdf() {
        return asdf;
    }

    public static int getAsdf2() {
        return asdf2;
    }

    public int getSorszam() {
        return sajatSorszam;
    }

//    public static int canTGetAsdf() {
//        return asdf;
//    }
}
