//Title: Lab 4 - Calculator.java
//Author: Andrew Steinberg 
//Purpose: To create a program that operates as a calculator for whatever numbers and operation the user imputs
import java.util.Scanner;
public class Calculator{
    public static void main (String[] args)
    {
        Scanner myScanner = new Scanner(System.in); // creates scanner so the user can input data
        System.out.println("Please input an integer: "); //prompts the user to input the first integer
        int a = myScanner.nextInt();// accepts the user input
        
        System.out.println("Please input another integer: ");//prompts the user to input the second integer
        int b = myScanner.nextInt();// accepts the user input
        
        System.out.println("Please input an operation: ");// prompts the user to input the operation
        char o = myScanner.next().charAt(0);// accepts the user input
        
        switch(o){ //switch statement
        case '+': System.out.println(a + b);//displays the first case if the user used the addition sign
        break; //a break statement is needed here so the computer knows when to stop
        
        case '-': System.out.println(a - b);//displays the second case if the user inputs the subtraction sign
        break;// " " "
        
        case '*': System.out.println(a * b);//displays the third case if the user inputs a multiplication sign
        break;// " " "
        
        case '/': System.out.println((double) a / (double) b);//displays the fourth case if the user inputs a division sign
        break;// " " "
        
        default: System.out.println("Invalid operator");// a default statement is needed to represent a case where the user doesnt input any of the four accepted operation signs
        }
        
    }
}