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

    public Person(Person.Builder builder) {
        this.vezeteknev = builder.vezeteknev;
        this.keresztnev = builder.keresztnev;
        this.gender = builder.gender;
        this.szuletesiEv = builder.szuletesiEv;
    }

    public static Person.Builder builder() {
        return new Person.Builder();
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

    public static class Builder {
        private String vezeteknev;
        private String keresztnev;
        private Gender gender;
        private int szuletesiEv;

        public Person build() {
            return new Person(this);
        }

        public Builder withVezeteknev(String vezeteknev) {
            this.vezeteknev = vezeteknev;
            return this;
        }

        public Builder withKeresztnev(String keresztnev) {
            this.keresztnev = keresztnev;
            return this;
        }

        public Builder withGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder withSzuletesiEv(int szuletesiEv) {
            this.szuletesiEv = szuletesiEv;
            return this;
        }
    }
}
