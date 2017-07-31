import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by karodes on 7/27/2017.
 */
public class MovieReader {
    public static void main(String[] args) {
        InputStream fis = null;
        try {
            fis = new FileInputStream("C:/Users/karodes/Documents/CdkTraining/FileHandling/MovieReader/src/MovieReview.txt");
            int b = fis.read();
            while(b != -1) {
                System.out.print((char)b);
                b = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null)
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }
}
