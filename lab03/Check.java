//Author: Andrew Steinberg
//Lab 03 - Check.java
//This lab is designed for the user to input their data for a check they recieved and the computer will output the amount of tip they should spend

import java.util.Scanner;
public class Check
{
    public static void main (String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        
        double checkCost = myScanner.nextDouble();
        
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        
        double tipPercent = myScanner.nextDouble();
        
        tipPercent /= 100; //We want to convert the percentage into a decimal value
        
        System.out.print("Enter the number of people who went out to dinner: ");
        
        int numPeople = myScanner.nextInt();
        
        double totalCost = checkCost * (1 + tipPercent);
        double costPerPerson = totalCost / numPeople;
        int dollars =(int)costPerPerson; //wholedollaramountofcost
        int dimes =(int)(costPerPerson * 10) % 10; //for storing digits //to the right of the decimal point //for the cost$
        int pennies =(int)(costPerPerson * 100) % 10; //for storing digits //to the right of the decimal point //for the cost$
        totalCost = checkCost * (1 + tipPercent); costPerPerson = totalCost / numPeople;
        //get the whole amount, dropping decimal fraction dollars=(int)costPerPerson;
        //get dimes amount, e.g.,
        // (int)(6.73 * 10) % 10 ­> 67 % 10 ­> 7
        // wherethe%(mod)operatorreturnstheremainder // afterthedivision: 583%100>83,27%5­>2 dimes=(int)(costPerPerson * 10) % 10; pennies=(int)(costPerPerson * 100) % 10; 
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);

    }
}