package main;

import person.Gender;
import person.Person;

public class Main {
    public static void main(String[] args) {
        Person.Builder personBuilder = Person.builder()
                .withVezeteknev("Kovacs")
                .withKeresztnev("Jozsef")
                .withGender(Gender.MALE)
                .withSzuletesiEv(1960);

        Person kovacsJozsi = Person.builder()
                .withVezeteknev("Kovacs")
                .withKeresztnev("Jozsef")
                .withGender(Gender.MALE)
                .withSzuletesiEv(1960)
                .build();
        Person kovacsJozsi2 = new Person("Kovacs", "Jozsef", Gender.MALE, 1960);
        Person kovacsJozsi3 = personBuilder.build();

        Person kissJozsi = personBuilder
                .withVezeteknev("Kiss")
                .build();

        Person szaboMari = new Person("Szabo", "Maria", Gender.FEMALE, 1980);

        System.out.println(kovacsJozsi);
        System.out.println(kovacsJozsi2);
        System.out.println(kovacsJozsi3);
        System.out.println(kissJozsi);
        System.out.println(szaboMari);

        System.out.println(kovacsJozsi.equals(kovacsJozsi));
        System.out.println(kovacsJozsi.equals(kovacsJozsi2));
        System.out.println(kovacsJozsi.equals(kovacsJozsi3));
        System.out.println(kovacsJozsi.equals(kissJozsi));
        System.out.println(szaboMari.equals(kovacsJozsi));
    }
}
