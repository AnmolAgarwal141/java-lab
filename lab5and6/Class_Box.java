// Program to Calculate the volume of a box
// @author Manik Chhabra
import java.util.Scanner;
class Box{
    double length, breadth, height, volume;
    Box(){
        length = -1;
        breadth = -1;
        height = -1;
        volume = -1;
    }
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Box Dimensions");
        System.out.print("Enter Length:- ");
        length = sc.nextDouble();
        System.out.print("Enter Breadth:- ");
        breadth = sc.nextDouble();
        System.out.print("Enter Height:- ");
        height = sc.nextDouble();
    }
    void showdata(){
        System.out.println("Length:- " + length);
        System.out.println("Breadth:- " + breadth);
        System.out.println("Height:- " + height);
        System.out.println("Volume:- " + volume);
    }
    double calcvolume(){
        return (length*breadth*height);
    }
}
public class Class_Box {
    public static void main(String[] args) {
        Box b = new Box();
        b.getdata();
        System.out.println("Volume of Box:- " + b.calcvolume());
    }
}
