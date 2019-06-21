/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwise;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Bitwise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        n=sc.nextInt();
        System.out.print(" No. divided by 2 will give: ");
        System.out.println(n>>>1);
        System.out.print(" No. multiplied by 2 will give: ");
        System.out.println(n<<1);
        
    }
}
