package inout;

import java.io.*;

public class Main4 {
    public static void main(String[] args) {
        try{
            String fileName = "codestates.txt";
            FileReader file = new FileReader(fileName);
            BufferedReader buffered = new BufferedReader(file);
            int data = 0;

            while((data = file.read()) != -1){
                System.out.print((char)data);
            }
            file.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
