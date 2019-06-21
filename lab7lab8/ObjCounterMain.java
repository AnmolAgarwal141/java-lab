/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
 class ObjCounter {
  static int c;
   ObjCounter()
   {
      c++;
       
   } 
   void count()
   {
       System.out.println("Number of objects :"+(c-1));
   }       
   
}
class ObjCounterMain {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ObjCounter o;
		ObjCounter o1=new ObjCounter();
        char c='y';
        while(c=='y')
        {
            o=new ObjCounter();
            
            System.out.println("Object Created");            
            System.out.println("enter y to create one more object:");
            c=s.next().charAt(0);
        }
        o1.count();
    }
}
  

