/*  1. Write java program to print file specification such as isFile,isDirectory,last
        modified date,file size,file patch etc
*/

import java.io.File;

public class Que1{
    public static void main(String[] args) {
        
        File file = new File("text.txt");
        
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.lastModified());
        System.out.println(file.length());
        System.out.println(file.toPath());
    }
}