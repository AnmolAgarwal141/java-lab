/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

/**
 *
 * @author Student
 */
import java.util.*;
public class replacerepeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        String str1=new String();
        System.out.println("enter a word which will replace the repeated characters");
        String s=sc.next();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {   
                if(str.charAt(i)=='1')
                    continue;
                if(str.charAt(i)==str.charAt(j))
                {
                    str=str.replace(str.charAt(i), '1');
                    str=str.replace(str.charAt(j), '1');
                }
                
            }
        
        }
        System.out.println(str);
        str1=str;
        int l=str.length();
        int k=s.length();
        int n=0,h=0;
        for(int i=0;i<l;i++)
        {
            if(str.charAt(i)=='1')
            {   
                if(i==0)
                {
                   str1= s + str1.substring(n*k+1,str1.length());
                   
                   n++;
                }
                else
                {
                str1= str1.substring(0,h+n*k) + s + str1.substring(n*k+h+1,str1.length());
                n++;
                
                }
                
            }
            else
                h++;
            
        }
        
        System.out.println(str1);
    }
    
}
