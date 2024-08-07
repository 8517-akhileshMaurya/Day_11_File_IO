package FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileContent {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("C:\\Users\\Akhilesh.Maurya\\Desktop\\word_count.txt");
            FileWriter writer = new FileWriter("destination.txt")){
               int Char;
               while ((Char = reader.read())!=-1){
                   writer.write(Char);
               }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
