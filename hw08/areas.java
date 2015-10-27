//Author: Andrew Steinberg
//Title: HW 08


import java.util.Scanner; 
public class areas{ 
    
    public static double area(double radius)
    {
        double areaCircle = Math.PI * (radius*radius);
        return areaCircle;
    }
    
    public static int area(int length, int width)
    {
        int areaRectangle = length * width;
        return areaRectangle;
    }
    
    public static int area(int baseOne, int baseTwo, int height)
    {
        int areaTrapezoid = ((baseOne + baseTwo) / 2) * height;
        return areaTrapezoid;
    }
    public static void main (String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        int a = 1;
        int b = 1;
        while(a == b)
        {
        System.out.println("Type one to make a shape or type two for no.");
        int c = myScanner.nextInt();
        if(c == 2)
        {
            break;
        }
        System.out.println("Enter 1 for area of a circle.");
        System.out.println("Enter 2 for area of a rectangle.");
        System.out.println("Enter 3 for area of a trapezoid.");
        int d = myScanner.nextInt();
        if(d == 1)
        {
            System.out.println("Enter the radius of the circle.");
            int r = myScanner.nextInt();
            double answer1 = area(r);
            System.out.println("The answer is " + answer1);
        }
        
        else if(d == 2)
        {
            System.out.println("Enter the length.");
            int length = myScanner.nextInt();
            System.out.println("Enter the width.");
            int width = myScanner.nextInt();
            int answer2 = area(length, width);
            System.out.println("The answer is " + answer2);
        }
        
        else if(d == 3)
        {
            System.out.println("Enter the first base.");
            int b1 = myScanner.nextInt();
            System.out.println("Enter the second base.");
            int b2 = myScanner.nextInt();
            System.out.println("Enter the height.");
            int ht = myScanner.nextInt();
            int answer3 = area(b1, b2, ht);
            System.out.println("The answer is " + answer3);
        }
        }
    }
}