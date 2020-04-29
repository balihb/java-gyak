import java.util.HashSet;

class Main
{
    public static void main(String[] args)
    {
        Vector vec23 = new Vector(2, 3);
        Vector vec24 = new Vector(2, 4);

        vec23.getMetheData(vec24);

        System.out.println("vec23.equals(vec23): " + vec23.equals(vec23));
        System.out.println("vec23.equals(null): " + vec23.equals(null));

        vec23 = null;

        //System.out.println(vec23.equals(null));

        System.out.println(new Vector(2, 3).equals(new Vector(2, 3)));
        System.out.println(new Vector(2, 3).equals(new Vector(2, 2)));

        HashSet<Vector> exampleSet = new HashSet<Vector>();
        exampleSet.add(new Vector(0, 0));
        exampleSet.add(new Vector(3, -7));
        exampleSet.add(new Vector(3, -7));
        System.out.println( "size of HashSet: " + exampleSet.size());
        System.out.println( "items of HashSet: " + exampleSet);
    }
}
