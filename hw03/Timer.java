//Author: Andrew Steinberg
//Title: HW 03 - Timer.java
//Purpose: To create a program that takes user input to compute the time the user has until dinner
import java.util.Scanner;
public class Timer {
    public static void main (String [] args)
    {
        Scanner myScanner = new Scanner(System.in); //creates a Scanner so the user can input their data
       
        System.out.println("Please input the current time in the form (HHMM): "); //promts the user with the current time
        
        int currentTime = myScanner.nextInt(); //accepts user input
        
        System.out.println("Please input the time you will be eating dinner in the form (HHMM): "); //prompts the user with the time they will be eating dinner
        
        int dinnerTime = myScanner.nextInt(); //accepts user input
        
        int hours = Math.abs(dinnerTime - currentTime) / 100; //calculates the hours until the user will eat dinner
        
        int mins = Math.abs(dinnerTime - currentTime) % 100; //calculates the minutes until the user will eat dinner
        
        System.out.println("You now have " + hours + " hours and " + mins + " minutes " + "until dinner time."); //outputs the time in hours and minutes until the user will have dinner
        
        
    }
}