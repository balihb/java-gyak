package utils;

public class DoubleVector { 
    private int N;   // a vektor hossza
    private double[] data; // a vektor komponenseinek tömbje

    // létrehoz egy N hosszú nullvektort
    public DoubleVector(int N) {
        this.N = N;
        this.data = new double[N];
    }

    // létrehoz egy vektort a megadott elemekkel
    public DoubleVector(double[] data) {
        N = data.length;
        this.data = new double[N];
        for (int i = 0; i < N; i++) {
            this.data[i] = data[i];
        }       
    }

    // a vektor hosszát adja vissza 
    public int length() {
        return N;
    }

    // visszaadja a vektor i. elemét
    public double get(int i) {
        return data[i];
    }

    // beállítja a vektor i. elemét az adott értékre
    public void set(int i, double element) {
        data[i]=element;
    }

    // két vektor skaláris szorzata
    public double dot(DoubleVector that) {
        if (N != that.N) throw new RuntimeException("Nem egyezik meg a két vektor dimenziója!");
        double sum = 0.0;
        for (int i = 0; i < N; i++)
            sum += data[i] * that.data[i];
        return sum;
    }

    // két vektor összegének kiszámítása
    public DoubleVector plus(DoubleVector that) {
        if (N != that.N) throw new RuntimeException("Nem egyezik meg a két vektor dimenziója!");
        DoubleVector result = new DoubleVector(N); //új vektorban adjuk vissza az eredményt
        for (int i = 0; i < N; i++) {    
            result.data[i]= data[i] + that.data[i];
        }    
        return result;
    }
 
    // két vektor különbségének kiszámítása
    public DoubleVector minus(DoubleVector that) {
        if (this.N != that.N) throw new RuntimeException("Nem egyezik meg a két vektor dimenziója!");
        DoubleVector result = new DoubleVector(N); //új vektorban adjuk vissza az eredményt
        for (int i = 0; i < N; i++) {    
            result.data[i]= data[i] - that.data[i];
        }    
        return result;
    }

    // vektor skalárral történő szorzása
    public DoubleVector times(double factor) {
        DoubleVector result = new DoubleVector(N);
        for (int i = 0; i < N; i++)
            result.data[i] = data[i] * factor;
        return result;
    }

    // vektor sztringként történő ábrázolása
    public String toString() {
        // a StringBuilder 5. gyakorlaton tanuljuk, ha valaki nem StringBuilder-t használ
        // hanem String-hez fűz hozzá, akkor az is teljes értékű megoldás

        StringBuilder s = new StringBuilder();
        s.append("(");
        for (int i = 0; i < N; i++) {
            s.append(data[i]);
            if (i < N-1) s.append(", ");
        }
        s.append(")");
        return s.toString();
    }

    public static double distance(DoubleVector v1, DoubleVector v2)
    {
        if (v1.N != v2.N) throw new RuntimeException("Nem egyezik meg a két vektor dimenziója!");

        double squared = 0;
        for (int i = 0; i < v1.N; i++)
        {
            squared += Math.pow(v1.data[i] - v2.data[i], 2);
        }

        return Math.sqrt(squared);
    }
}
