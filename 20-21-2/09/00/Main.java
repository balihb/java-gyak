import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reszelheto mf = new Mindenfelezett();
        mf.reszel();
        ((Porzsolheto) mf).porzsol();
        List myl = new ArrayList();
    }
}
