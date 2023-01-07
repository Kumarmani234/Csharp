// Constructor program

public class Constructor
{
  public int id;
  public string name;
  public Constructor(int Id,string Name)
  {
      this.id=Id;
      this.name=Name;
  }
  public static void Main(string[] args)
  {
      Constructor p=new Constructor(1002,"kumar");
      Console.WriteLine($"employee id is : {p.id} \n employee name is : {p.name}");
  }
}



/* output : employee id is : 1002
           employee name is : kumar  */