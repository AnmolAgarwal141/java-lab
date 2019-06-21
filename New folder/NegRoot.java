/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MAHE
 */
import java.lang.Math;
import java.util.Scanner;

 class NegRoot {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to find the square root");
            int a = sc.nextInt();
            if(a<0){
                throw new Exception("Square root could not be found as "+a+
                        " is less than 0");
            }
            System.out.println("Square root of "+a+" = "+Math.sqrt(a));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}