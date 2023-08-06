/*
    Create string by using below ways and compare using “==” and equals() method:
        a. String s1=”abc”;//literal way
        b. String s2=”abc”;
        c. String s3=new String(“abc”); //using new keyword
        d. String s4=new String(“abc”); 
*/

public class Que6 {
    public static void main(String[] args) {
        
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));              
        System.out.println(s3.equals(s4));

        System.out.println("-----------------------------------");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);

    }
}
