public class Q5 {
    public static void main(String[] args) {
        line ob=new line();
        train t1=new train(ob,"t1");
        train t2=new train(ob,"t2");
        t1.start();
        t2.start();

    
}}
class line
{
synchronized public void getline()
   { for(int i=0;i<3;i++)
       System.out.println(i);
     try{Thread.sleep(1000);}
    catch(Exception e)
    {System.out.println("caught"+e);}
   }
}
class train extends Thread
{ line l;String ThreadName;
 train(line l,String name)
 {this.l=l;
 ThreadName=name;}
 public void run()
 { System.out.println(ThreadName);
 l.getline();}
}

