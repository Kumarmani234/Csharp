// Encapsulation program



public class Encapsulation
{
    public int id;
    public string name;
    public void setvalues(int Id,string Name)
    {
        this.id=Id;
        this.name=Name;
    }
    public void getvalues()
    {
        Console.WriteLine($"Employee ID : {id} \n Employee Name : {name}");
    }
    public static void Main(string[] args)
    {
        Encapsulation e=new Encapsulation();
        e.setvalues(1002,"KUMAR");
        e.getvalues();
    }
}


/*  output : Employee ID : 1002
             Employee Name : KUMAR   */