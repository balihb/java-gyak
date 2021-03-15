public enum WildAnimal {
    MAJOM("malnat", 210),
    ELEFANT("epret", 520),
    ZSIRAF("kortet", 340),
    MOSOMEDVE("almat", 130);

    private final int db;
    private final String gyumolcs;

    WildAnimal(final String gyumolcs, final int db) {
        this.gyumolcs = gyumolcs;
        this.db = db;
    }

    @Override
    public String toString() {
        return toStringCached();
    }

    private String toStringNaive() {
        System.out.println("naive");
        return ordinal() + ": " + name() + " szeretne enni " + db + " " + gyumolcs + " egy héten.";
    }

    private String toStringSB() {
        System.out.println("sb");
        StringBuilder sb = new StringBuilder();
        sb.append(ordinal());
        sb.append(": ");
        sb.append(name());
        sb.append(" szeretne enni ");
        sb.append(db);
        sb.append(" ");
        sb.append(gyumolcs);
        sb.append(" egy héten.");
        return sb.toString();
    }

    private String toStringFormat() {
        System.out.println("format");
        return String.format(
                "%d: %s szeretne enni %d %s egy héten.",
                ordinal(), name(), db, gyumolcs
        );
    }

    private enum ToStringVersion {
        NAIVE, SB, FORMAT;
    }

    private final static ToStringVersion TS_VER = ToStringVersion.FORMAT;

    private String toStringChooser() {
        switch (TS_VER) {
            case NAIVE:
                return toStringNaive();
            case SB:
                return toStringSB();
            default:
                return toStringFormat();
        }
    }

    private String toStringCache;

    private String toStringCached() {
        if (toStringCache == null) {
            toStringCache = toStringChooser();
        }
        return toStringCache;
    }
}
