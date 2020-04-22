public class Main {
    public static void main(String[] args) {
        Kenokes enKenokesem = new Kenokes(10, true);
        Sefkes enSefkesem = new Sefkes(15, false);

        AltalanosEvoeszkozTok<?> tokWildcardal = new AltalanosEvoeszkozTok<Kes>(enSefkesem);
        // tokWildcardal.getTarolt().getPengehossz();

        AltalanosEvoeszkozTok<Kes> tokKes = new AltalanosEvoeszkozTok<Kes>(enSefkesem);
        tokKes.getTarolt().getPengeHossz();
        // tokKes.getTarolt().isEles();
        tokKes.setTarolt(enKenokesem);

        AltalanosEvoeszkozTok<Sefkes> tokSefkes = new AltalanosEvoeszkozTok<Sefkes>(enSefkesem);
        tokSefkes.getTarolt().getPengeHossz();
        tokSefkes.getTarolt().isEles();
        // tokSefkes.setTarolt(enKenokesem);
        // tokSefkes.setTarolt((Sefkes) enKenokesem);
    }
}
