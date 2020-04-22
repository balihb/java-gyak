public class AltalanosEvoeszkozTok<T extends Evoeszkoz> {
    private T tarolt;

    public AltalanosEvoeszkozTok(T tarolt) {
        this.tarolt = tarolt;
    }

    public T getTarolt() {
        return tarolt;
    }

    public void setTarolt(T tarolt) {
        this.tarolt = tarolt;
    }
}
