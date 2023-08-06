/* practice StringBuffer methods such as length(),
capacity(),append(),insert(),delete() etc */

public class Que4 {
    
    public static void main(String[] args) {

        String str = "Kaustubh";
        StringBuffer sb = new StringBuffer(str);

        System.out.println(sb);   // Kaustubh
        System.out.println(sb.length());  // 8
        System.out.println(sb.capacity()); // 24
        System.out.println(sb.append("Gadakh"));  // KaustubhGadakh
        System.out.println(sb.insert(0 ,"Hi "));  //Hi KaustubhGadakh
        System.out.println(sb.delete(3, 11));  // Hi Gadakh
    }
}
