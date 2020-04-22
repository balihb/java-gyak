public class Kenokes extends Kes {
    private final boolean reces;

    public Kenokes(int pengeHossz, boolean reces) {
        super(pengeHossz);
        this.reces = reces;
        System.out.println("kenokes");
    }

    @Override
    public String toString() {
        return "Kenokes{" +
                "reces=" + reces +
                ", pengeHossz=" + super.getPengeHossz() +
                '}';
    }

    public boolean isReces() {
        return reces;
    }
}
