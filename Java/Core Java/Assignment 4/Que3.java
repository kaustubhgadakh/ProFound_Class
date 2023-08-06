/*Use the String Class Methods like length, hashCode,equals, replace, trim,
subString, concatinate , compare , charAt, subString etc.. for a given String(s) */

public class Que3 {
    public static void main(String[] args) {
        
        String s = "Hello";
        String s1 = "World";
        String s2 = "hello";
        String s3 = " Kaustubh ";
        
        System.out.println(s); // Hello
        System.out.println(s.length());  // 5
        System.out.println(s.hashCode());  // 69609650
        System.out.println(s1.equals(s2));  // false
        System.out.println(s.replace("l", "L"));   //HeLLo
        System.out.println(s3.trim());   // Kaustubh  <- remove Space
        System.out.println(s.substring(0, 3));   //Hel
        System.out.println(s.concat(s1));  // HelloWorld
        System.out.println(s.compareTo(s2));  // -32        
        System.out.println(s.charAt(0));  // H

    }
}
