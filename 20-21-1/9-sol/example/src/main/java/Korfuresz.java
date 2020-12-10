public class Korfuresz extends Vas {
    final int korte;

    final static String SOME_STATIC_STRING = "Korfuresz";

    public Korfuresz(int alma, int korte) {
        super(alma);
        this.korte = korte;
    }

    public Korfuresz() {
        this(1, 2);
    }

    @Override
    public String toString() {
        return "Korfuresz{" +
                "korte=" + korte +
                ", alma=" + alma +
                '}';
    }

    public int getKorte() {
        return korte;
    }
}
