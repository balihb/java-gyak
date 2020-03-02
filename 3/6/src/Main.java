import stringutils.IterLetter;

public class Main {
    public static void main(String[] args) {
        IterLetter iterLetterEmpty = new IterLetter("");
        IterLetter iterLetterNull = new IterLetter(null);
        IterLetter iterLetter = new IterLetter("valami");

        while (iterLetterEmpty.hasNext()) {
            iterLetterEmpty.printNext();
        }

        while (iterLetterNull.hasNext()) {
            iterLetterNull.printNext();
        }

        while (iterLetter.hasNext()) {
            iterLetter.printNext();
        }

        iterLetter.printNext();

        while (iterLetter.hasNext()) {
            iterLetter.printNext();
        }

        iterLetter.restart();

        while (iterLetter.hasNext()) {
            iterLetter.printNext();
        }
    }
}
