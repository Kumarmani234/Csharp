// Accessmodifiers program


/*
public class Public
{
    public int id=10;
    public string name="kumar";
}
public class Child : Public                          // output : 10 kumar
{
    public static void Main(string[] args)
    {
        Public p=new Public();
        Console.WriteLine(p.id+" " +p.name);
    }
}
*/



.......................................................................................................


/*
public class Private
{
    private int id=10;
    private string name="kumar";
}
public class Child : Private                          // output : private is can not accessible
                                                                  in another class
{
    public static void Main(string[] args)
    {
        Private p=new Private();
        Console.WriteLine(p.id+" " +p.name);
    }
}
*/


 ......................................................................................................


/*
public class Protected
{
    protected int id=10;
    protected string name="kumar";
}
public class Child : Protected                       // output : 10 kumar
{
    public static void Main(string[] args)
    {
        Child p=new Child();
        Console.WriteLine(p.id+" " +p.name);
    }
}
*/


