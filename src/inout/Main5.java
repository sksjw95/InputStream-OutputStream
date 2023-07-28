package inout;

import java.io.FileWriter;
import java.io.IOException;

public class Main5 {
    public static void main(String[] args) {
        try{
            String fileName = "codestates1.txt";
            FileWriter writer = new FileWriter(fileName);

            String str = "written!";
            writer.write(str);
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
