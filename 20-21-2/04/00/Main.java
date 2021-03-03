public class Main {
    public static void main(String[] args) {
        String valtozo = "str1";
        valtozo = "str2";

        // str2str3
        String valtozo2 = valtozo + "str3";

        System.out.println(valtozo2);

        int intem = 3;

        Integer integet = masikFuggveny(intem);

        int integet2 = integet;

        System.out.println(integet);

/*        MyClass myc = new MyClass(integet2);

        System.out.println(myc.getAsdf());

        myc.asdf2 = 2;

        System.out.println(myc.asdf2);

        MyClass myc2 =  new MyClass(intem);

        System.out.println(myc2.asdf2);*/

        System.out.println(MyClass.getAsdf2());


/*        try {
            Thread.sleep(400000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    public static int masikFuggveny(int megkapottInt) {
        System.out.println(megkapottInt);

/*        try {
            Thread.sleep(400000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        return megkapottInt + megMasikFuggveny(1, 4);
    }

    public static int megMasikFuggveny(int bejovoInt, int masikParam) {
/*        try {
            Thread.sleep(400000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return bejovoInt + masikParam;
    }
}
