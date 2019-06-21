class rectangle{
public  static void main(String args[])
{int l,b;
l=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
int area=l*b;
int circumference=2*(l+b);
System.out.println("length is" +l);
System.out.println("breadth is"+b);
System.out.println("area is" +area);
System.out.println("circumference is" +circumference);
}}