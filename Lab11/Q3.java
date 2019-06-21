class oneThread extends Thread implements Runnable{
   private Thread t;
   private String threadName;
   
   oneThread( String name) {
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
public class Q3{
    public static void main(String[] args) 
    { 
        oneThread c1 = new oneThread("T1"); 
        oneThread c2 = new oneThread("T2"); 
        c1.start(); 
        c2.start(); 
        System.out.println(c1.isAlive()); 
        System.out.println(c2.isAlive()); 
         try { 
            c1.join();
            c2.join();
        } 
        catch (InterruptedException ie) { 
        } 
    } 
} 
