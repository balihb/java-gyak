class Negy {
    public static void main(String[] args) {
        if (args.length > 0) {
            // kiirjuk a felhasznalonevet
            System.out.println("Hello " + args[0]);
            // a length egy property, nem függvény
            System.out.println("Parameterek szama: " + args.length);
        } else {
            System.out.println("Nem kaptam eleg parametert");
        }
    }
}
