// Throw program


public class AgeCalculatorException : Exception
{
    public AgeCalculatorException(string message) : base(message)
    {
        
    }
}
public class User
{
    static void validate(int age)
    {
        if(age<18)
        {
            throw new AgeCalculatorException("sorry,Age be greater than 18");
        }
    }
    public static void Main(string[] args)
    {
        try
        {
         validate(12);
        }
        catch(AgeCalculatorException e)
        {
            Console.WriteLine(e);
        }
        Console.WriteLine("rest of the code");
    }
}


/* output :    mono /tmp/6GnM3WyYjM.exe
               AgeCalculatorException: sorry,Age be greater than 18
               at User.validate (System.Int32 age) [0x00015] in <46c086d64ae946019ed57de6fef063b2>:0 
               at User.Main (System.String[] args) [0x00002] in <46c086d64ae946019ed57de6fef063b2>:0 
               rest of the code      */