public class Adder
{
    public static String add(final String s1, final String s2) {
        if(s1 == null || s2 == null) {
            throw new IllegalArgumentException("One or both parameter was null");
        }

        String s1conv = s1.trim().startsWith("0b") ? s1.trim().substring(2) : s1.trim();
        int s1base = s1.trim().startsWith("0b") ? 2 : 10;

        String s2conv = s2.trim().startsWith("0b") ? s2.trim().substring(2) : s2.trim();
        int s2base = s2.trim().startsWith("0b") ? 2 : 10;

        try {
            return Integer.toString(Integer.parseInt(s1conv, s1base) + Integer.parseInt(s2conv, s1base));
        }
        catch (NumberFormatException ex) {
            try {
                return Double.toString(Double.parseDouble(s1) + Double.parseDouble(s2));
            }
            catch (NumberFormatException ex2) {
                throw new IllegalArgumentException("One or both of the parameters were not numbers");
            }
        }
    }
}
