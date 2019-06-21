/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         float a,b;
        char operator;
        char choose;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no. say A :");
        a=sc.nextFloat();
        System.out.println("enter another no. say B: ");
        b=sc.nextFloat();
        do{
            System.out.println("enter any operator '+' ,'-','*','/' : ");
        operator=sc.next().charAt(0);
        switch(operator)
        {
            case '+':
                System.out.println("Answer = "+(a+b));
                break;
            case '-':
                 System.out.println("Answer = "+(a-b));
                break;
            case '*':
                System.out.println("Answer = "+(a*b));
                break;
            case '/':
                 System.out.println("Answer = "+(a/b));
                break;
            }
        System.out.println("Do another(y/n)?");
        choose=sc.next().charAt(0);
        }while(choose!='n');
            
        
    }
    
}
