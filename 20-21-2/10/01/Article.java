import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Article {
    private final String title, body, conclusion;
    private final List<Book> refs;

    public Article(String title, String body, String conclusion) {
        this.title = title;
        this.body = body;
        this.conclusion = conclusion;
        this.refs = new ArrayList<>();
    }

    public void print(String destFile) {
        try(Closeable pw = new PrintWriter(destFile)) {
            ((Appendable) pw).append("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
