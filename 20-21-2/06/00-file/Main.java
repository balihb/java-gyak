import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File myf = new File("afile.txt");
        try {
            System.out.println(myf.createNewFile());
            System.out.println(myf.exists());
            File myfp = myf.getAbsoluteFile().getParentFile();
            System.out.println(myfp.getAbsolutePath());
            System.out.println(myfp.isDirectory());
            File myfpc = new File(myfp, "gyereke");
            System.out.println(myfpc.isDirectory());
            myfpc.mkdir();
            System.out.println(myfpc.isDirectory());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
