package BufferRearderWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyUtility {
    public static void main(String[] args) {

        String sourceFilePath = "C:\\Users\\Akhilesh.Maurya\\Desktop\\word_count.txt";
        String destinationFilePath = "C:\\Users\\Akhilesh.Maurya\\Desktop\\word2_count.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFilePath))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

