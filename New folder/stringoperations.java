/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Student
 */
import java.util.*;
class stringoperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String str;
        int charac=0,words=0,lines=0,vowels=0;
        System.out.println("enter strings and to stop enter a string :- break");

        while(sc.hasNextLine())
        {
            lines++;
            str=sc.nextLine();
            if(str.equals("break"))
            {
                break;
            }
			charac=charac+str.length();
        for(int i=0;i<str.length();i++)
        {
            
            if(str.charAt(i)==' '&&Character.isLetter(str.charAt(i+1)))
            {
                words++;
            }
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
            {
                vowels++;
            }
        }
         words++;
        
        }
        System.out.println("NO. of characters are "+charac);
        System.out.println("NO. of words are "+words);
        System.out.println("NO. of vowels are "+vowels);
        System.out.println("NO. of lines  are "+(lines-1));
        
        
        
    }
    
}
