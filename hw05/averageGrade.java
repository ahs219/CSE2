import java.util.Scanner;
public class averageGrade
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);// creates a scanner so the user can input data
        System.out.println("Please input a grade");//prompts the user to input a grade
        double i = scan.nextDouble(); //accepts user input
        double gradeCount = 0.0;//initilaizes a variable that stores the number of grades the user inputs
        double grade = 0.0;//initializes a variable that stores the value of the grade the user inputs
        
        while(i >= 0 || i <= 100) //while loop that continuously prompts the user to input a grade unless they enter 999
        {
            grade += i;//adds the value grade to the variable i which the user inputs
            gradeCount++;//counts the number of grades the user inputs
            
            
            if(i ==999)//if statement that will exit the while loop if the user enters the value 999
            {
               break;//break statement to exit the while loop
            }
            
            else if(i < 0 || i > 100)//else if statement that will display that it is an invalid grade if the user inputs a number less than 0 or greater than 100
            {
                 System.out.println("This is an invalid grade");//tells the user that the grade is invalid
            }
            System.out.println("Please input a grade");//continuously prompts the user to input a grade
            i = scan.nextDouble();//accepts the user input for the grade they enter
        }
        double actualGrade = grade - 999;//variable that will subtract the 999 from the sum of the grades the user entered when they entered 999 to exit the loop
        double actualCount = gradeCount - 1;////variable that will subtract the 999 from the count of the grades the user entered when they entered 999 to exit the loop
        System.out.println("The average grade is: " + actualGrade/ actualCount);//computes and displays the average of the valid grades entered
    }
}