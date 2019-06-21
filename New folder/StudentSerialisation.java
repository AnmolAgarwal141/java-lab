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
class Student implements Serializable{
    String firstName, lastName;
    Character Grade;
    int marks[] = new int[3];
    int percentage;
    Student(){
        marks[0]=marks[1]=marks[2]=0;
    }
    Student(String f, String l, int arr[]){
        firstName = f;
        lastName = l;
        marks = arr;
        calc();
        grade();
    }
    void calc(){
        int sum=0;
        for(int a: marks)
            sum+=a;
        percentage = sum/3;
    }
    void grade(){
        if(percentage>90){
            Grade = 'A';
        }else if(percentage>80){
            Grade = 'B';
        }else if(percentage>70){
            Grade = 'C';
        }else{
            Grade = 'F';
        }
    }
    void display(){
        System.out.println("\n"+firstName+" "+ lastName);
        System.out.println("Grade: "+ Grade);
    }
}
 class StudentSerialisation {
    public static void main(String[] args){
        try{
            FileOutputStream fout = new FileOutputStream("Student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            int a[] ={54,71,41};
            int b[] ={89,91,66};
            int c[] ={68,50,99};
            Student s1 = new Student("Teja","Vemuri",a);
            Student s2 = new Student("Pratyusha","Rao",b);
            Student s3 = new Student("Mihir","Vora",c);
            out.writeObject(s1);
            out.writeObject(s2);
            out.writeObject(s3);
            out.close();
            fout.close();
            FileInputStream fin = new FileInputStream("Student.ser");
            ObjectInputStream oin = new ObjectInputStream(fin);
            boolean eof = false;
            while(!eof){
                Student s=  (Student)oin.readObject();
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
