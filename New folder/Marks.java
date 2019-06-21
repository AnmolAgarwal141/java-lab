class MarkOutOfBoundsException extends Exception
{
  MarkOutOfBoundsException()
  {
    System.out.println("Out of Range.");
  }
}

class Marks
{
  public static void main(String[] args)
  {
    String s = args[0];
    try
    {int k=Integer.parseInt(s);
      if(k > 100||k<0)
        throw new MarkOutOfBoundsException();
      else System.out.println("Okay.");
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
