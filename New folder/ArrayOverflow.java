import java.util.Scanner;

class Overflow
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter size of array.");
    int n;

    try
    {
      n = s.nextInt();
      if(n < 0) throw new NegativeArraySizeException();
    }
    catch(NegativeArraySizeException e)
    {
      System.out.println(e);
      n = 16;
    }

    int[] x = new int[n];

    System.out.println("Enter an index to access.");

    try
    {
      x[s.nextInt()] = 0;
    }
    catch(Exception e)
    {
      System.out.println("Accessing invalid index.");
    }
  }
}

class NegativeArraySizeException extends Exception
{
  NegativeArraySizeException()
  {
    System.out.println("Negative size not possible. Initialized array to default size of 16.");
  }
}
