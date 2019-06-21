/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg8;

/**
 * 
 * @author Student
 */
import java.util.*;
interface sports
{
    void getNumberOfGoals(int n);
    void dispTeam(String t);
}
class Hockey
{
    public void getNumberOfGoals(int n)
    {
        System.out.println("Goals: "+n);
    }
    public void dispTeam(String t)
    {
        System.out.println("Team: "+t);
    }
}
class Football
{
     public void getNumberOfGoals(int n)
    {
        System.out.println("Goals: "+n);
    }
    public void dispTeam(String t)
    {
        System.out.println("Team: "+t);
    }
}

public class Add3 {
    
    public static void main(String[] args) 
    {
         Hockey h = new Hockey();
         Football f = new Football();
         System.out.println("Hockey: ");
         h.getNumberOfGoals(9);
         h.dispTeam("India");
         System.out.println(" ");
         System.out.println("Football: ");
         f.getNumberOfGoals(5);
         f.dispTeam("Brazil");
    }
}
