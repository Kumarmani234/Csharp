// Hierarichal Inheritance program


public class HierarichalInheritance
{
    public string s="class",r="This";
}
public class Child : HierarichalInheritance
{
    public void m2()
     {
      Console.WriteLine(r+" is fist child "+s);
     }
}
public class Child2 : HierarichalInheritance
{
    public void m3()
    {
        Console.WriteLine(r+" is second child "+s);
    }
    public static void Main(string[] args)
    {
     Child d=new Child();
     d.m2();
    Child2 e=new Child2();
    e.m3();
    }
}


/* output : This is first child class
            This is second child class  */