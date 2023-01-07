// class GenericClass<M>
// {
//     public GenericClass(M msg)
//     {
//         Console.WriteLine(msg);
//     }
// }
// class program{
//     static void Main(string[] args)
//     {
//         GenericClass<string> s =new GenericClass<string>("THIS IS A GENERIC CLASS PROGRAM");
//         GenericClass<int> i=new GenericClass<int> (1002);
//         GenericClass<char> c =new GenericClass<char>('k');
//     }
// }











// class GenericClass
// {
//     public void show<T>(T msg)
//     {
//         Console.WriteLine(msg);
//     }
// }
// class program{
//     static void Main(string[] args)
//     {
//         GenericClass gc=new GenericClass();
//         gc.show("this is generic method ");
//         gc.show(1011+" ");
//         gc.show('d');
//     }
// }












// delegate int calculater(int n);
// public class DelegateExample
// {
//     static int number =100;
//     public static int Add(int n)
//     {
//         number =number+n;
//         return number;
//     }
//      public static int Mul(int n)
//     {
//         number =number*n;
//         return number;
//     }
//     public static int getNumber()
//     {
//         return number;
//     }
// class program
// {
//     static void Main(string[] args)
//     {
//         calculater c1=new calculater(Add);
//         calculater c2=new calculater(Mul);
//         c1(20);
//         Console.WriteLine("After c1 delegate ,number is:"+getNumber());
//         c2(3);
//         Console.WriteLine("After c2 delegate ,number is:"+getNumber());
//     }
// }
// }










// delegate void EmployeeDelegate();
// class Demo
// {
//     static public void develop()
//     {
//         Console.WriteLine("I am a Developer");
//     }
//      static public void test()
//      {
//         Console.WriteLine("I am a Tester");
//     }
// }
// class program{
//     public static void Main(string[] args)
//     {
//         EmployeeDelegate m1=new EmployeeDelegate(Demo.develop);
//          EmployeeDelegate m2=new EmployeeDelegate(Demo.test);
//          EmployeeDelegate m3=m1 + m2;
//          EmployeeDelegate m4=m2 + m1;
//          m3();
//          m4();
//     }
// }
