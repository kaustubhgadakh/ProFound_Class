/*Write a java program to split string by “blank space” and “-” patterns */

public class Que5 {
    public static void main(String[] args) {
        
        String str = "Hello World";        
        String[] str1 = str.split("l",2);
        for(String b : str1){
            System.out.println(b);
        }

    }
}
