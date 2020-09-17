package person;

public class Person {
    private final String vezeteknev;
    private final String keresztnev;
    private final Gender gender;
    private final int szuletesiEv;

    public Person(String vezeteknev, String keresztnev, Gender gender, int szuletesiEv) {
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.gender = gender;
        this.szuletesiEv = szuletesiEv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

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
