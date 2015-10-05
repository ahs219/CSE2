import java.util.Scanner;
public class timeSheets
{
    public static void main (String [] args)
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a non negative number representing the number of employees");//prompts the user to input the number of employees
        int numEmployees = scan.nextInt();//accepts user input for number of employees
        
        int totalPay = 0;
        for(int i = 0; i < numEmployees; i++)//loops through all the employees
        {
            int totalHours = 0;
            
            System.out.println("Please input the amount of pay the employee recieves per hour in cents");//prompts the user to input the total pay per hour fpr the employee in cents
        int payPerEmployee = scan.nextInt();//accepts user input for the pay per employee
        
        
        for(int j = 0; j < 5; j++)//loops through the days of the week
        {
            System.out.println("How many hours does the employee work per each workday, mon-fri");//prompts the user to input the hours the employee works per day
            int hoursWorked = scan.nextInt();//accepts user input for days of the week
            totalHours += hoursWorked;//calculates the total hours worked per week
        }
        totalPay = totalPay + (payPerEmployee * totalHours);//calculates the total pay for the employee
        
        }
        
        System.out.println(totalPay);//displays total pay the employee recieves
        
    }
}