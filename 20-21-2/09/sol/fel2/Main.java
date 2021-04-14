

import java.util.ArrayList;

class Main
{
    public static ArrayList<String> getStrSameBeginningAndEnding(ArrayList<String> list)
    {
        ArrayList<String> result = new ArrayList<String>();
        for (String element : list)
        {
            final int len = element.length();
            if (len > 0 && element.charAt(0) == element.charAt(len - 1))
            {
                result.add(element);
            }
        }
        return result;
    }

    public static void removeStrDifferBeginningAndEnding(ArrayList<String> list)
    {
        list.removeIf(element -> (element.length() <= 0 || element.charAt(0) != element.charAt(element.length() - 1)));
    }

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        //ArrayList<String> list = new ArrayList<>();

        list.add("java");
        list.add("c++");
        list.add("ada");
        list.add("");
        list.add("hello world");
        list.add("add________hghjAa");

        System.out.println(list);
        System.out.println(getStrSameBeginningAndEnding(list));
        removeStrDifferBeginningAndEnding(list);
        System.out.println(list);
    }
}

