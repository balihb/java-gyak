package person;

public class StaticGender {
    public final static StaticGender MALE;
    public final static StaticGender FEMALE;

    static {
        MALE = new StaticGender();
        FEMALE = new StaticGender();
    }

    private StaticGender() {
    }
}
