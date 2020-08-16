import java.io.File;
import java.io.FileReader;

public class TryCatch {
    public static void main(String[] args) {
        File file = new File("./somefile.txt");
        try {
            FileReader reader = new FileReader(file);
        }
        catch (java.io.FileNotFoundException e) {
            System.out.println("File not found!\n" + e);
        }
    }
}
