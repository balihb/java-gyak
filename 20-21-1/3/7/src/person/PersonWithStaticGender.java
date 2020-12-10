package person;

public class PersonWithStaticGender {
    private final String vezeteknev;
    private final String keresztnev;
    private final StaticGender gender;
    private final int szuletesiEv;

    public PersonWithStaticGender(String vezeteknev, String keresztnev, StaticGender gender, int szuletesiEv) {
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.gender = gender;
        this.szuletesiEv = szuletesiEv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonWithStaticGender person = (PersonWithStaticGender) o;

        if (szuletesiEv != person.szuletesiEv) return false;
        if (!vezeteknev.equals(person.vezeteknev)) return false;
        if (!keresztnev.equals(person.keresztnev)) return false;
        return gender == person.gender;
    }

    @Override
    public int hashCode() {
        int result = vezeteknev.hashCode();
        result = 31 * result + keresztnev.hashCode();
        result = 31 * result + gender.hashCode();
        result = 31 * result + szuletesiEv;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "vezeteknev='" + vezeteknev + '\'' +
                ", keresztnev='" + keresztnev + '\'' +
                ", gender=" + gender +
                ", szuletesiEv=" + szuletesiEv +
                '}';
    }
}
