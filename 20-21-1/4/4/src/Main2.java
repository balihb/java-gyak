public class Main2 {
    public static void main(String[] args) {
        String s1 = "";
        StringBuilder sb = new StringBuilder();
        sb.append("len of s1 = ");
        sb.append(s1);
        System.out.println(sb.toString());

        String s2 = "";
        System.out.println("len of s2 = " + s2.length());
        s2 += "hello";
        s2 += "world";

        // Mely objektumokat törölheti a garbage collector ezen a ponton?

        System.out.println("len of s2 = " + s2.length());
    }
}
