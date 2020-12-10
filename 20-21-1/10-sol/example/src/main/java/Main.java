import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Kenokes enKenokesem = new Kenokes(10, true);
        Sefkes enSefkesem = new Sefkes(15, false);

        Kes enKesem = new Kenokes(11, true);

        enKesem.getPengeHossz();
        //enKesem.isReces();

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

        Map<String, Kes> keseim = new HashMap<String, Kes>();

        keseim.put("Az en Sefkesem", enSefkesem);

        keseim.get("Az en Sefkesem");
    }
}
