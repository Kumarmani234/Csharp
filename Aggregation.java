// Aggregation program



public class Aggregation
{
    public string city,state,country;
    public Aggregation(string City,string State,string Country)
    {
        this.city=City;
        this.state=State;
        this.country=Country;
    }
}
public class Aggregation2
{
    public int empid;
    public string empname;
    public Aggregation address;
    public Aggregation2 (int Empid,string Empname,Aggregation Add)
    {
        this.empid=Empid;
        this.empname=Empname;
        this.address=Add;
    }
     public void display()
     {
         Console.WriteLine($" City : {address.city} \n State : {address.state} \n Country : {address.country} \n Empid : {empid} \n Empname : {empname}");
     }
}
public class Aggregate
{
    public static void Main(string[] args)
    {
      Aggregation a=new Aggregation("Amalapuram","Andhra pradesh","India");
      Aggregation2 e=new Aggregation2(1002,"kumar",a);
      e.display();
    }
}


/* output :  City : Amalapuram
             State : Andhra pradesh
             Country : India
             Empid : 1002
             Empname : kumar   */