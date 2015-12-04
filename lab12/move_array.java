import java.util.Scanner;
public class move_array{
    public static void main(String[] args){
    //initializing the scanner class
    Scanner myScanner = new Scanner(System.in);
    //asking for user input
    System.out.print("Enter the size of the array: ");
    int size = myScanner.nextInt();
    int[] array1 = null; 
    //try and catch statement to check the value entered
    try{
        array1 = new int[size];
    }catch(Exception e){
        System.out.println("Invalid input"); 
        
    }
    //for loop that runs through the array
    for(int i=0; i < array1.length; i++){
        array1[i]=(int)(Math.random()*100); 
        System.out.print(array1[i] + " "); 
    }
    //asking user for input
    System.out.print("Enter the index of the value to be moved"); 
    //declaring variables
    int moveIndex = myScanner.nextInt(); 
    int temp = 0;
    //try and catch statement that checks the value entered
    try{
        temp = array1[moveIndex];
    }catch(Exception e){
        System.out.println("Invalid Input");
    }
    //for loops that move that array
    int i=0;
    for ( i = moveIndex; i < array1.length - 1; i++){
        array1[i] = array1[i + 1];
    }
    array1[size - 1] = temp; 
    
    for (i=0; i < array1.length; i++){
        //printing the output
        System.out.print(array1[i] + " ");
    }
    
    }
    
    }