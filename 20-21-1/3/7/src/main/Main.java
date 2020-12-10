package main;

import person.*;

public class Main {
    public static void main(String[] args) {
        Person kovacsJozsi = new Person("Kovacs", "Jozsef", Gender.MALE, 1960);
        Person kovacsJozsi2 = new Person("Kovacs", "Jozsef", Gender.MALE, 1960);
        Person szaboMari = new Person("Szabo", "Maria", Gender.FEMALE, 1980);

        int alma = 1;
        int korte = 1;

        if(alma == korte) {
            System.out.println("alma egyenlo korte");
        }

        String almastr = "alma";
        String almastr2 = "alma";

        TwoStr twoStr1 = new TwoStr();
        TwoStr twoStr2 = new TwoStr();
        twoStr1.str1 = almastr;
        twoStr1.str2 = almastr2;
        twoStr2.str1 = almastr;
        twoStr2.str2 = almastr2;

        if(twoStr1.equals(twoStr2)) {
            System.out.println("egyenlo");
        } else {
            System.out.println("nem egyenlo");
        }

        PersonWithStaticGender szaboMariSt = new PersonWithStaticGender("Szabo", "Maria", StaticGender.FEMALE, 1980);

        System.out.println(kovacsJozsi);
        System.out.println(kovacsJozsi2);
        System.out.println(szaboMari);

        System.out.println(kovacsJozsi.equals(kovacsJozsi));
        System.out.println(kovacsJozsi.equals(kovacsJozsi2));
        System.out.println(szaboMari.equals(kovacsJozsi));
    }
}
