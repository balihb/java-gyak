public class Sefkes extends Kes {
    private boolean eles;

    public Sefkes(int tomeg, boolean eles) {
        super(tomeg);
        this.eles = eles;
        System.out.println("sefkes");
    }

    public Sefkes() {
        this(1, false);
    }

    @Override
    public String toString() {
        return "Sefkes{" +
                "eles=" + eles +
                ", pengeHossz=" + super.getPengeHossz() +
                '}';
    }

    public boolean isEles() {
        return eles;
    }

    public void elezes() {
        this.eles = true;
    }
}
