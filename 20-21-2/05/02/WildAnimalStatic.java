public class WildAnimalStatic {
    private final String name;
    private final int ordinal;
    private final String gyumolcs;
    private final int db;

    public final String name() {
        return name;
    }
    public final int ordinal() {
        return ordinal;
    }

    private WildAnimalStatic(String name, int ordinal, String gyumolcs, int db) {
        this.name = name;
        this.ordinal = ordinal;
        this.gyumolcs = gyumolcs;
        this.db = db;
    }

    public final static WildAnimalStatic MAJOM;
    public final static WildAnimalStatic ELEFANT;
    public final static WildAnimalStatic ZSIRAF;
    public final static WildAnimalStatic MOSOMEDVE;

    private final static WildAnimalStatic[] VALUES;

    static {
        MAJOM = new WildAnimalStatic("MAJOM", 0, "malnat", 210);
        ELEFANT = new WildAnimalStatic("ELEFANT", 1, "epret", 520);
        ZSIRAF = new WildAnimalStatic("ZSIRAF", 2, "kortet", 340);
        MOSOMEDVE = new WildAnimalStatic("MOSOMEDVE", 3, "almat", 130);

        VALUES = new WildAnimalStatic[] {
          MAJOM, ELEFANT, ZSIRAF, MOSOMEDVE
        };
    }

    public static WildAnimalStatic[] values() {
        return VALUES.clone();
    }

    @Override
    public String toString() {
        return ordinal() + ": " + name() + " szeretne enni " + db + " " + gyumolcs + " egy héten.";
    }
}
