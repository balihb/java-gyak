import java.io.File;

public class Main {
    public static void main(String[] args) {
        //Book bk = new Book();
        //System.out.println(bk.getShortName());
        Book bk2 = new PrintedBook("asdf", "qwertz", 1331, PrintedBookCoverType.Softcover);
        System.out.println(bk2.getPrice());

        //System.out.println(pb2.printedBookSpecific());
    }
}
