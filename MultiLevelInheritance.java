// Multi level Inheritance


public class MultiLevelInheritance
{
    public int age=21;
    public string name="kumar";
    public void m1()
    {
        Console.WriteLine(name+" age is "+age);
    }
}
public class Child : MultiLevelInheritance
{
    public void m2()
     {
      Console.WriteLine("This is a child class");
     }
}
public class Derived : Child
{
    public void m3()
    {
        Console.WriteLine("This is a derived class");
    }
    public static void Main(string[] args)
    {
     Derived d=new Derived();
     d.m1();
     d.m2();
     d.m3();
    }
}


/* output : kumar age is 21
            This is a child class
            This is a derived class  */