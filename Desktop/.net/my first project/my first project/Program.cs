using System;

public class Class1
{
    public Class1()
    {
        Console.WriteLine("Enter n1");
        int n1 = Convert.ToInt32(Console.ReadLine());
        while(n1<=10)
        {
            Console.WriteLine(n1);
            n1++;
        }
       
    }
    public static void Main(String[] args)
    {
        Class1 ob = new Class1();
    }
}