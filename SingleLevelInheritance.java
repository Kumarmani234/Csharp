// Single level Inheritance


public class SingleLevelInheritance
{
    public int age=21;
    public string name="kumar";
    public void m1()
    {
        Console.WriteLine(name+" age is "+age);
    }
}
public class Child : SingleLevelInheritance
{
    public void m2()
     {
      Console.WriteLine("its a single level inheretance");
     }
     public static void Main(string[] args)
     {
       Child c=new Child();
       c.m1();
       c.m2();
     }
}


/* output : kumar age is 21
            its a single level inheritance */