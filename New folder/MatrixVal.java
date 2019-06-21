/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MAHE
 */
import java.util.Scanner;
class ValidException extends Exception{
    String str = "Exception: Matrix is not a square matrix";
    public String toString(){
        return str;
    }
}
class MatrixVal {
    public static void main(String[] args){
        try{
            System.out.println("Enter dimensions of the Matrix: ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a!=b){
                throw new ValidException();
            }
        }catch(ValidException e){
            System.out.println(e);
        }
    }
}