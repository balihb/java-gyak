import java.lang.Enum;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        WildAnimal majom = WildAnimal.MAJOM;
        System.out.println(majom);

        WildAnimalStatic majomS = WildAnimalStatic.MAJOM;
        System.out.println(majomS);

        System.out.println("listAllAnimals");
        System.out.println(listAllAnimals());
        System.out.println("listAllAnimalsAL");
        System.out.println(listAllAnimalsAL());

        System.out.println("listAllAnimalsStatic");
        System.out.println(listAllAnimalsStatic());
        System.out.println("listAllAnimalsStaticAL");
        System.out.println(listAllAnimalsStaticAL());
    }

    private static String listAllAnimals() {
        WildAnimal[] wav = WildAnimal.values();
        String[] was = new String[wav.length];
        for(int i = 0; i < wav.length; i++) {
            was[i] = wav[i].toString();
        }
        return String.join(System.lineSeparator(), was);
    }

    private static String listAllAnimalsAL() {
        WildAnimal[] wav = WildAnimal.values();
        ArrayList<String> was = new ArrayList<>(wav.length);
        for (WildAnimal wa : wav) {
            was.add(wa.toString());
        }
        String[] wasArr = new String[wav.length];
        return String.join(System.lineSeparator(), was.toArray(wasArr));
    }

    private static String listAllAnimalsStatic() {
        WildAnimalStatic[] wav = WildAnimalStatic.values();
        String[] was = new String[wav.length];
        for(int i = 0; i < wav.length; i++) {
            was[i] = wav[i].toString();
        }
        return String.join(System.lineSeparator(), was);
    }

    private static String listAllAnimalsStaticAL() {
        WildAnimalStatic[] wav = WildAnimalStatic.values();
        ArrayList<String> was = new ArrayList<>(wav.length);
        for (WildAnimalStatic wa : wav) {
            was.add(wa.toString());
        }
        String[] wasArr = new String[wav.length];
        return String.join(System.lineSeparator(), was.toArray(wasArr));
    }
}
