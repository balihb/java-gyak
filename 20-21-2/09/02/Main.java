import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> getStrSameBeginningAndEnding(List<String> par) {
        List<String> ret = new ArrayList<>();
        for(String elm : par) {
            if(elm != null && elm.length() > 0 && elm.charAt(0) == elm.charAt(elm.length() - 1)) {
                ret.add(elm);
            }
        }
        return ret;
    }

    public static List<String> removeStrDifferBeginningAndEnding(List<String> par) {
        par.removeIf(elm -> elm == null || elm.length() <= 0 || elm.charAt(0) != elm.charAt(elm.length() - 1));
        return par;
    }

    public static boolean shouldRemove(String elm) {
        return elm == null || elm.length() <= 0 || elm.charAt(0) != elm.charAt(elm.length() - 1);
    }

    public static List<Integer> addOne(List<Integer> par) {
        par.replaceAll(elm -> elm + 1);
        //par.replaceAll(new AddOne());
        return par;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("agda");
        list.add("ada");
        list.add("kalap");
        list.add("kabat");
        list.add("");
        list.add(null);
        list.add("abba");
        list.add("edda");
        list.add("acdc");

        System.out.println(list);
        System.out.println(getStrSameBeginningAndEnding(list));
        System.out.println(removeStrDifferBeginningAndEnding(list));

        List<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println(addOne(intList));
    }
}
