/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author MAHE
 */    
public class ArrOverflow {

    public static void main(String[] args){
        try{
            int arr[] = new int[5];
            int i = 0;
            do{
                arr[i++] = 5;
            }while(arr[i]!=-1);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array is out of space\n"+e);
        }
    }
}