package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntVector {
    private final int[] ns;
    private ToStringSelector ts = ToStringSelector.FORSTR;

    public IntVector(int[] numbers) {
        ns = Arrays.copyOf(numbers, numbers.length);
    }

    public IntVector(int[] numbers, ToStringSelector ts) {
        ns = Arrays.copyOf(numbers, numbers.length);
        this.ts = ts;
    }

    public void add(int n) {
        for (int i = 0; i < ns.length; i++)
            ns[i] += n;
    }

    public String toString() {
        switch (ts) {
            case FORSTRBUFF: return toStringForStrBuffer();
            case ARRAY: return toStringArray();
            case LIST: return toStringList();
            case SREAM: return toStringStream();
            default: return toStringForStr();
        }
    }

    private String toStringForStr() {
        String output = "";
        for(int i = 0; i < ns.length; i++) {
            if(i == 0) {
                output += String.valueOf(ns[i]);
            } else {
                output += " " + ns[i];
            }
        }
        return output;
    }

    private String toStringForStrBuffer() {
        StringBuffer output = new StringBuffer();
        for(int i = 0; i < ns.length; i++) {
            if(i == 0) {
                output.append(ns[i]);
            } else {
                output.append(" " + ns[i]);
            }
        }
        return output.toString();
    }

    private String toStringForStrBuffer2() {
        StringBuffer output = new StringBuffer();
        for(int i = 0; i < ns.length; i++) {
            if(i == 0) {
                output.append(ns[i]);
            } else {
                output.append(" ");
                output.append(ns[i]);
            }
        }
        return output.toString();
    }

    private String toStringArray () {
        String[] output = new String[ns.length];
        for(int i = 0; i < ns.length; i++) {
            output[i] = String.valueOf(ns[i]);
        }
        return String.join(" ", output);
    }

    private String toStringList() {
        List<String> output = new ArrayList<String>(ns.length);
        for(int v : ns) {
            output.add(String.valueOf(v));
        }
        return String.join(" ", output);
    }

    // ezt nem kell tudni. kizárólag érdekesség
    private String toStringStream() {
        String[] output = Arrays
                .stream(ns)
                .boxed()
                .map(String::valueOf)
                .toArray(String[]::new);
        return String.join(" ", output);
    }
}
