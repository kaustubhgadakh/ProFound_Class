/*
    1. Write a Java program to create Thread and practice below mehtods.
        getName(): It is used for Obtaining a thread’s name
        getPriority(): Obtain a thread’s priority
        isAlive(): Determine if a thread is still running
        join(): Wait for a thread to terminate
        run(): Entry point for the thread
        sleep(): suspend a thread for a period of time
        start(): start a thread by calling its run() method 
 */

public class Que1 extends Thread{

    public void run(){
        System.out.println("Thread " + getName() + " is running.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println("Thread " + getName() + " was interrupted.");

            e.printStackTrace();
            System.out.println("Thread " + getName() + " has finished.");
            
        }
    }
    public static void main(String[] args) {
        Que1 t1 = new Que1();        
        Que1 t2 = new Que1();

        System.out.println("Thread 1 name: " + t1.getName());
        System.out.println("Thread 2 name: " + t2.getName());

        System.out.println("Thread 1 priority: " + t1.getPriority());
        System.out.println("Thread 2 priority: " + t2.getPriority());

        System.out.println("Thread 1 is alive: " + t1.isAlive());
        System.out.println("Thread 2 is alive: " + t2.isAlive());
        
        t1.start();        
        t2.start();

        System.out.println("Thread 1 is alive: " + t1.isAlive());
        System.out.println("Thread 2 is alive: " + t2.isAlive());

        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
  
        System.out.println("Thread 1 is alive: " + t1.isAlive());
        System.out.println("Thread 2 is alive: " + t2.isAlive());
        

        System.out.println("Main thread has finished.");     
        
    }
}