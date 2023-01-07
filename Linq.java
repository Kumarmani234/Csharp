//Linq basic program




using System;
using System.Linq;
public class program
{
public static void Main()
    {
        string[] names={"Bill","Steve","James","Mohan"};
        var myLinqQuery=from name in names 
                        where name.Contains('a') 
                        select name;
        foreach (var name in myLinqQuery)
        Console.WriteLine(name+" ");
    }
}