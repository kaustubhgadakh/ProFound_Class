import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String a = Integer.toBinaryString(x);
        String b = Integer.toHexString(x);
        String c = Integer.toOctalString(x);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
