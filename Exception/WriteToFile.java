package Exception;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("File.txt");
            writer.write("Hello, World!!");
            writer.close();

            System.out.println("Data written to the file was a success");
        }catch(IOException e){
            System.out.println("An error occured..");
            e.printStackTrace();
        }
    }
}
