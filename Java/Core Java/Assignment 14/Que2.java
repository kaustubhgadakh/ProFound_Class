/*
    2. Write a Java program to create multiple threads using Runnabel interface and print
        currently running thread.
 */
public class Que2 implements Runnable{
    
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Thread finished: " + Thread.currentThread().getName());

    }


    public static void main(String[] args) {
        Que2 rannable1 = new Que2(); 
        Thread t1 = new Thread(rannable1);

        Que2 rannable2 = new Que2();
        Thread t2 = new Thread(rannable2);

        t1.start();
        t2.start();

        System.out.println("Main thread is running: " + Thread.currentThread().getName());

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Main thread has finished.");


    }

    
}
