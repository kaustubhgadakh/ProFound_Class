/*
    2. Write a java program to read & write the content to and from “myFile.txt” using
        FileInputStream and FileOutputStream API
 */

import java.io.File;
import java.io.FileOutputStream;
// import java.io.FileInputStream;
import java.io.IOException;

public class Que2 {

    public static void main(String[] args) {
        //  FileInputStream
        /*
            try {
            File file = new File("myFile.txt");
            file.createNewFile();

            FileInputStream fin = new FileInputStream(file);
            int i = fin.read();
            System.out.println(i);
            fin.close();

            } catch (IOException e) {
            e.printStackTrace();
            }
         */

        //  FileOutputStream
        
        try {

            File file = new File("myFile.txt");
            file.createNewFile();

            FileOutputStream fout = new FileOutputStream(file);
            fout.write(97);
            fout.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
