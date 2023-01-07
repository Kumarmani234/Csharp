//Abstraction program

abstract class Abstraction
{
 public abstract void display();
 public void m1(string name)
 {
   Console.WriteLine(name+" : Showing only necessary data");
 }
}
 class Abstraction2 : Abstraction
{
  public override void display()
  {
    Console.WriteLine("kumar");
  }
}
public class Add
{
    public static void Main(string[] args)
    {
       Abstraction2 a=new Abstraction2();
       a.display();
       a.m1("Abstraction");
       
    }
}

/* output : kumar
            Abstraction : Showing only necessary data */