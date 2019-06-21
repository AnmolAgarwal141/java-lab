import java.util.*;

class RunnableDemo implements Runnable {
   private Thread t;
   private String threadName;
   
   RunnableDemo( String name) {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
   public void run() {
      System.out.println("Running " +  threadName );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            Thread.sleep(50);
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

class ThreadDemo extends Thread 
{ 
    public void run() 
    { 
        try
        { 
           System.out.println("Creating " +  Thread.currentThread().getName() );
            System.out.println("Running " +  Thread.currentThread().getName() );
           for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);}
        } 
        catch (Exception e) 
        { 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
public class TestThread {

   public static void main(String args[]) {
      System.out.println("Enter 1 for runnable and 2 for Thread");
      Scanner sc = new Scanner(System.in);
      int x= sc.nextInt();
      if(x==1)
      {RunnableDemo R1 = new RunnableDemo( "Thread-1");
      R1.start();}
      else
      {ThreadDemo R2 = new ThreadDemo();
      R2.start();}
   }   
}
