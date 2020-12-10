public class Vas {
    final int alma;

    final static String SOME_STATIC_STRING = "Egyedem";

    public Vas(int alma) {
        this.alma = alma;
    }

    @Override
    public String toString() {
        return "Vas{" +
                "alma=" + alma +
                '}';
    }

    public int getAlma() {
        return alma;
    }
}
