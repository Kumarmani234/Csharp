// Overloading program


public class Overloading 
{
    public void m1(int x,int y)
    {
        Console.WriteLine($" X value is : {x} \n Y value is : {y}");
    }
    public void m1(int z,string name)
    {
        Console.WriteLine($" Z value is : {z} \n These are {name}");
    }
    public static void Main(string[] args)
    {
      Overloading a=new Overloading();
      a.m1(10,20);
      a.m1(30,"numeric values");
    }
}



/* output : X value is : 10
            Y value is : 20
            Z value is : 30
            These are numeric values */