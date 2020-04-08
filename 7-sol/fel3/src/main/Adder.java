public class Adder
{
    public static String add(final String s, final String s2) {
        if(s == null || s2 == null) {
            throw new IllegalArgumentException("One or both parameter was null");
        }
        try {
            return Integer.toString(Integer.parseInt(s.trim()) + Integer.parseInt(s2.trim()));
        }
        catch (NumberFormatException ex) {
            try {
                return Double.toString(Double.parseDouble(s) + Double.parseDouble(s2));
            }
            catch (NumberFormatException ex2) {
                throw new IllegalArgumentException("One or both of the parameters were not numbers");
            }
        }
    }
}
