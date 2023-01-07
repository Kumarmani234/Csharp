// lamda program




using System;
using System.Linq;
class Student
{
    public int StudentID{get;set;}
    public string StudentName{get;set;}
    public int Age{get;set;}
}
class Program
{
    static void Main(string[] args)
    {
        Student[] studentArray={
            new Student() {StudentID=1,StudentName= "kumari",Age=10},
            new Student() {StudentID=2,StudentName= "kiran",Age=21},
            new Student() {StudentID=3,StudentName= "Bill",Age=25},
            new Student() {StudentID=4,StudentName= "shankar",Age=20},
            new Student() {StudentID=5,StudentName= "kumar",Age=31},
            new Student() {StudentID=6,StudentName= "narendra",Age=17},
            new Student() {StudentID=7,StudentName= "Bill",Age=19},
        };
        Student[] teenAgerStudents=studentArray.Where(s=> s.Age>12 && s.Age<20).ToArray();
        Console.WriteLine("using LINQ to find Number of students between 12 to 20 : ");
        Console.WriteLine(teenAgerStudents?.Length);


        Student bill=studentArray.Where(s=> s.StudentName =="Bill").FirstOrDefault();
        Console.WriteLine("using LINQ to find Id of first students whose name is Bill : ");
        Console.WriteLine(bill?.StudentID);


        Student student5=studentArray.Where(s=> s.StudentID==5).FirstOrDefault();
        Console.WriteLine("using LINQ to find student whose StudentID is 5: ");
        Console.WriteLine(student5?.StudentName);
    }
}
        
        
        
