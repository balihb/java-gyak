public abstract class Kes extends Evoeszkoz{
    private final int pengeHossz;

    public Kes(int pengeHossz) {
        super();
        this.pengeHossz = pengeHossz;
        System.out.println("kes");
    }

    @Override
    public String toString() {
        return "Kes{" +
                "pengeHossz=" + pengeHossz +
                '}';
    }

    public int getPengeHossz() {
        return pengeHossz;
    }
}
