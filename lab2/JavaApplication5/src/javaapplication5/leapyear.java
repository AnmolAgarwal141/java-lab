/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class leapyear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n; boolean leap;
        System.out.println("enter a year: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%4!=0)
            leap=false;
        else if(n%100!=0)
            leap=true;
        else
            if(n%400!=0)
                leap=false;
        else
                leap=true;
        if(leap)
            System.out.println(n+ " is a leap year");
        else
            System.out.println(n+ " is  not a leap year");
    }
    
}
