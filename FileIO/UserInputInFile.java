package FileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInputInFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("User_input.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter content in file");
            String input = sc.nextLine();
            writer.write(input);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
