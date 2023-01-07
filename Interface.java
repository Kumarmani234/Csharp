//Interface program

interface IStudent
{
    void display(string name);
}
public class IStudent2 : IStudent
{
    public void display(string name)
    {
      Console.WriteLine("student name is : "+name);
    }
}
public class College
{
    public static void Main(string[] args)
    {
        IStudent2 i=new IStudent2();
        i.display("kumar");
    }
}

// output : student name is : kumar