package stringutils;

public class IterLetter {
    private final String str;
    private int position = 0;

    public IterLetter(String str) {
        if(str == null) {
            this.str = "";
        } else {
            this.str = str;
        }
    }

    public void printNext() {
        if (position < str.length()) {
            System.out.println(str.charAt(position));
            position++;
        }
    }

    public void restart() {
        position = 0;
    }

    public boolean hasNext() {
        return position < str.length();
    }
}
