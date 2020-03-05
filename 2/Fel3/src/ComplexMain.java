public class ComplexMain {
    public static void main(String[] args) {
        Complex comp1 = new Complex(4, 5);
        Complex comp2 = new Complex(6, -6);
        Complex comp3 = comp1.add(comp2);
        System.out.println(comp3.getRe() + " " + comp3.getIm());
    }
}
