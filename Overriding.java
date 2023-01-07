//Overriding program


public class Overriding
{
 public virtual void display()
 {
     Console.WriteLine("This is a fist method");
 }
}
public class Overriding2 : Overriding
{
  public override void display()
  {
     Console.WriteLine("This is a second method");
  }
}
public class Over
{
  public static void Main(string[] args)
  {
    Overriding o=new Overriding();
    o.display();
    Overriding2 e=new Overriding2();
    e.display();
  }
}



/*  output : This is a first method
             This is a second method  */