package main;

import person.Gender;
import person.Person;

public class Main {
    public static void main(String[] args) {
        Person kovacsJozsi = new Person("Kovacs", "Jozsef", Gender.MALE, 1960);
        Person kovacsJozsi2 = new Person("Kovacs", "Jozsef", Gender.MALE, 1960);
        Person szaboMari = new Person("Szabo", "Maria", Gender.FEMALE, 1980);

        System.out.println(kovacsJozsi);
        System.out.println(kovacsJozsi2);
        System.out.println(szaboMari);

        System.out.println(kovacsJozsi.equals(kovacsJozsi));
        System.out.println(kovacsJozsi.equals(kovacsJozsi2));
        System.out.println(szaboMari.equals(kovacsJozsi));
    }
}
