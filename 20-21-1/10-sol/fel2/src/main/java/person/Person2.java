package person;

import java.util.Objects;

public class Person2 {
    private String firstname, lastname;
    private String occup;
    private Gender gen;
    private int birthYear;

    public Person2(String firstname, String lastname, String occup, Gender gen, int birthYear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.occup = occup;
        this.gen = gen;
        this.birthYear = birthYear;
    }

    public String toString() {
        return "(" + firstname + "," + lastname + "," + occup + "," + gen + "," + birthYear + ")";
    }

    @Override
    public boolean equals(Object that) {
        if(that == this) return true;
        if(that == null) return false;

        if(that instanceof Person2) {
            Person2 thatPerson = (Person2) that;
            return firstname.equals(thatPerson.firstname) &&
                    lastname.equals(thatPerson.lastname) &&
                    occup.equals(thatPerson.occup) &&
                    gen.equals(thatPerson.gen) &&
                    birthYear == thatPerson.birthYear;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, occup, gen, birthYear);
    }
}
