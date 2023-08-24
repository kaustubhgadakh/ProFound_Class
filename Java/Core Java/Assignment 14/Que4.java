/*
    4.  Write a JAVA program which will generate the threads:
        - To display 10 terms of Fibonacci series. (class Fibonacci extends Thread)
        - To display 1 to 10 in reverse order. (class Reverse extends Thread)
 */
class Fibonacci extends Thread{
    public void run(){
        int n = 10;
        int a = 0;
        int b = 1;
        
        System.out.println("=======================================");

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
        System.out.println();
        System.out.println("=======================================");

    }
}

class Reverse extends Thread{
    public void run(){

        System.out.println();
        System.out.print("Reverse Order: ");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        
        System.out.println();
        System.out.println("=======================================");
    }
}

public class Que4 {
    public static void main(String[] args) {
        
        Fibonacci fib = new Fibonacci();
        Reverse rev = new Reverse();
                
        fib.start();
        try {
            fib.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        rev.start();       


    }
}
