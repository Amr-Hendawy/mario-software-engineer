using System;

class Program
{
    static double circleArea(double r)
    {
        const double PI = Math.PI;
        double area = PI * r * r;
        return area;
    }

    static void Main()
    {
        Console.WriteLine(circleArea(5));
        Console.WriteLine(circleArea(10));
        Console.WriteLine(circleArea(15));
    }
}