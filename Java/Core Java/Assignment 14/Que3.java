/*
     3. Write a program that creates 2 threads (Thread1,Thread2)- each displaying a
        message (Pass the message as a parameter to the constructor). The threads should
        display the messages continuously till the user presses ctrl+c. (use Thread.sleep(400))
 */

public class Que3 implements Runnable{

    private String message;

    public Que3(String message) {
        this.message = message;
    }

    public void run(){

        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }

    }
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new Que3("Thread1: Hello from Thread1!"));
        Thread thread2 = new Thread(new Que3("Thread2: Hi from Thread2!")); 


        thread1.start();
        thread2.start();

         // Wait for user to press Ctrl+C to terminate
         try {
            System.out.println("Press Ctrl+C to stop.");
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

    }
}
