import java.util.Scanner;
public class timeSheets
{
    public static void main (String [] args)
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a non negative number representing the number of employees");
        int numEmployees = scan.nextInt();
        
        int totalPay = 0;
        for(int i = 0; i < numEmployees; i++)
        {
            int totalHours = 0;
            
            System.out.println("Please input the amount of pay the employee recieves per hour in cents");
        int payPerEmployee = scan.nextInt();
        
        
        for(int j = 0; j < 5; j++)
        {
            System.out.println("How many hours does the employee work per each workday, mon-fri");
            int hoursWorked = scan.nextInt();
            totalHours += hoursWorked;
        }
        totalPay = totalPay + (payPerEmployee * totalHours);
        
        }
        
        System.out.println(totalPay);
        
    }
}