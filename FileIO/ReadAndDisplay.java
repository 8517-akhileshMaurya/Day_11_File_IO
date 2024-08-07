package FileIO;

import java.io.FileReader;
import java.io.IOException;

public class ReadAndDisplay {
    public static void main(String[] args) {
        try(FileReader reader1 = new FileReader("C:\\Users\\Akhilesh.Maurya\\Desktop\\word2_count.txt")){
            int character;

            System.out.println("Contents of file1.txt:");
            while ((character = reader1.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
