// TRY CATCH FINALLY PROGRAM


public class Values
{
    public static void Main(string[] args)
    {
    try
    {
    int a=10;
    int b=2;
    int x=a/b;
    }
    
    catch(Exception e)
    {
    Console.WriteLine(e);
    }
    finally
    {
        Console.WriteLine("finally block is executed");
    }
    Console.WriteLine("rest of the code");
    }
}


/* OUTPUT : finally block is executed
            rest of the code  */