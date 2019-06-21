class mythread extends Thread
{  int pri;
    String ThreadName;
    mythread(int p,String name)
    { pri=p;
	ThreadName=name;}
    public void run()
    {for(int i=0;i<5;i++)
    System.out.println(ThreadName+": "+i);
     try{ Thread.sleep(2000);}
     catch(Exception e) 
     { System.out.println("caught");}
    }
}
public class Q4 {

    public static void main(String[] args) {
        mythread t1=new mythread(Thread.MAX_PRIORITY,"t1");
         mythread t2=new mythread(Thread.NORM_PRIORITY+1,"t2");
         mythread t3=new mythread(Thread.NORM_PRIORITY-2,"t3");
         t1.start();
         t2.start();
         t3.start();
         try { t1.join();
               t2.join();
               t3.join();
            }
            catch(Exception e)
            {}
           
    }
    
}

