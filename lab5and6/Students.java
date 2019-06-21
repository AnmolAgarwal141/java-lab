// Program to implement student fee system
import java.util.Scanner;
class Student{
    int regno, age;
    String name;
    Student(int regno, int age, String name){
        this.regno = regno;
        this.age = age;
        this.name = name;
    }
}
class UG extends Student{
    int semester;
    double fee;
    UG(int regno, int age, String name){
        super(regno, age, name);
        semester = -1;
        fee = -1;
    }
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Semester:- ");
        semester = sc.nextInt();
        System.out.print("Enter Fee:- ");
        fee = sc.nextDouble();
    }
    void showdata(){
        System.out.println("Name:- "+name);
        System.out.println("Registration Number:- "+regno);
        System.out.println("Age:- "+age);
        System.out.println("Semester:- "+semester);
        System.out.println("Fee:- "+fee);
    }
}
class PG extends Student{
    int semester;
    double fee;
    PG(int regno, int age, String name){
        super(regno, age, name);
        semester = -1;
        fee = -1;
    }
        void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Semester:- ");
        semester = sc.nextInt();
        System.out.print("Enter Fee:- ");
        fee = sc.nextDouble();
    }
    void showdata(){
        System.out.println("Name:- "+name);
        System.out.println("Registration Number:- "+regno);
        System.out.println("Age:- "+age);
        System.out.println("Semester:- "+semester);
        System.out.println("Fee:- "+fee);
    }
}
class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Registration Number:- ");
        int regno = sc.nextInt();
        System.out.print("Enter Name:- ");
        String name = sc.next();
        System.out.print("Enter Age:- ");
        int age = sc.nextInt();
        System.out.println("1. UG Student");
        System.out.println("2. PG Student");
        System.out.print("Enter Choice:- ");
        int ch = sc.nextInt();
        switch(ch){
            case 1: UG s1 = new UG(regno, age, name);
                    s1.getdata();
                    s1.showdata();
                    break;
            case 2: PG s2 = new PG(regno, age, name);
                    s2.getdata();
                    s2.showdata();
                    break;
            default: System.out.println("Invalid Choice.");
        }
    }
}
