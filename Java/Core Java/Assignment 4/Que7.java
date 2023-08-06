/*
    Write a Java program to return the sum of the digits present in the given string. If
    there is no digits the sum return is 0.
        a. String s=”14abc9kj”;
        b. O/p: 1+4+9=14

 */

public class Que7 {
    public static void main(String[] args) {

        String str = "14abc9kj";
        int sum = 0;

        for(int i=0;i<str.length();i++){ 
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                // sum+=(str.charAt(i)-'0');
                sum = sum + (str.charAt(i)-'0');
            }
        }
        System.out.println("Sum of all digits " +sum );
    }
}
