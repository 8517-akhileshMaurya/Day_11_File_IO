package InsurancePolicyDataManagement;

import java.io.*;

public class PolicyManager {
    public static void main(String[] args) {
        String input_File = "C:\\Users\\Akhilesh.Maurya\\Desktop\\policies.txt";
        String output_File = "Output.txt";

        int totalPolicy = 0 ;
        int totalAmount = 0 ;

        try(BufferedReader reader = new BufferedReader(new FileReader(input_File))) {
            String line;
            while ((line = reader.readLine()) != null){
             String[] data = line.split(",");
                if(data.length == 3){
                    int amount = Integer.parseInt(data[2].trim());
                    totalPolicy++;
                    totalAmount += amount;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(output_File))){
            writer.write(totalPolicy);
            writer.newLine();
            writer.write(totalAmount);
            System.out.println(totalPolicy);
            System.out.println(totalAmount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
