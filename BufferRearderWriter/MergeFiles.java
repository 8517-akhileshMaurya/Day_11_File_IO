package BufferRearderWriter;


import java.io.*;

public class MergeFiles {
    public static void main(String[] args) {
        String[] inputFiles = {"C:\\Users\\Akhilesh.Maurya\\Desktop\\word_count.txt", "C:\\Users\\Akhilesh.Maurya\\Desktop\\word2_count.txt", "C:\\Users\\Akhilesh.Maurya\\Desktop\\word3_count.txt"};
        String outputFile = "C:\\Users\\Akhilesh.Maurya\\Desktop\\word1_count.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String inputFile : inputFiles) {
                try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    System.err.println("Error reading file: " + inputFile);
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + outputFile);
            e.printStackTrace();
        }
    }
}
