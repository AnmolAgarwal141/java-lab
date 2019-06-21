/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MAHE
 */
import java.io.*;
class Employee implements Serializable{
    String empName;
    double deduction ,allowance,Pay, totalSalary;
    Employee(String name, double d, double a, double p){
        empName = name;
        deduction = d; allowance = a; Pay = p;
        total();
    }
    void total(){
        totalSalary = Pay + allowance - deduction;
    }
    void display(){
        System.out.println("\n" + empName + "\n" + totalSalary);
    }
}

class EmployeeSerialisation {
    public static void main(String[] args){
        try{
            FileOutputStream fout = new FileOutputStream("Employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            Employee e1 = new Employee("Shreya", 34000.0,210000.0,550000.0);
            out.writeObject(e1);
            out.close();
            fout.close();
            FileInputStream fin = new FileInputStream("Employee.ser");
            ObjectInputStream oin = new ObjectInputStream(fin);
            boolean eof = false;
            while(!eof){
                Employee s=  (Employee) oin.readObject();
                if(s!=null){
                    s.display();
                }else{
                    eof = true;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

