// Linq +delegate program




using System;
using System.Linq;
class Student
 {
    public int StudentID{get;set;}
    public string? StudentName{get;set;}
    public int Age{get;set;}
 }
 delegate bool FindStudent(Student std);
  class StudentExtension
 {
    public static Student[] where(Student[] stdArray,FindStudent del)  
    {
        int i=0;
        Student[] result = new Student[10];
        foreach(Student std in stdArray)
        if(del(std))
        {
            result[i]=std;
            i++;
            Console.WriteLine(std?.StudentName);
        }
        return result;
    }
}
   /*This is a method in the StudentExtension class that takes in an array of Student objects and a delegate FindStudent as arguments,
 and returns an array of Student objects. The method iterates over the input array and for each Student object, 
 it checks if the delegate del returns true when passed the Student object as an argument. If the delegate returns true,
  the Student object is added to the result array and its StudentName property is printed to the console.
The ?. operator is known as the null-conditional operator and it is used to safely access a member of an object or array. 
It allows you to access the member only if the object or array is not null. If the object or array is null, 
the expression returns null instead of throwing a NullReferenceException. */
class Program
{
    static void Main(string[] args)
    {
        Student[] StudentArray={
            new Student() {StudentID=1,StudentName= "sri",Age=10},
            new Student() {StudentID=2,StudentName= "kiran",Age=21},
            new Student() {StudentID=3,StudentName= "varun",Age=25},
            new Student() {StudentID=4,StudentName= "shankar",Age=20},
            new Student() {StudentID=5,StudentName= "kumar",Age=31},
            new Student() {StudentID=6,StudentName= "narendra",Age=17},
            new Student() {StudentID=7,StudentName= "suresh",Age=19},
        };
        Student[] students=StudentExtension.where(StudentArray,delegate(Student std){return std.Age>12 && std.Age<26;});
    }
}
