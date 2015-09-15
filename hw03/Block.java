//Author: Andrew Steinberg
//Title: HW 03 - Block.java
//Purpose: To write a program that prompts the user for the length, width, and height of a block and then computes and prints out the volume

import java.util.Scanner; //imports the Scanner class

public class Block {
    public static void main (String[] args)
    {
        Scanner myScanner = new Scanner(System.in); //creates a Scanner so the user can input their data (the blocks length, width, and height)
        
        System.out.println("Please input the block's length: "); //prompts the user with the block's length
        double length = myScanner.nextDouble(); //accepts the user input for length
        
        System.out.println("Please input the block's width: "); //prompts the user with the block's width
        double width = myScanner.nextDouble(); //accepts the user input for width
        
        System.out.println("Please input the block's height: "); //prompts the user with the block's height
        double height = myScanner.nextDouble(); // accepts the user input for height
      
        double volumeOfBlock = (length * width * height); //calculates the volume of the block by multiplying the length x width x height
        
        System.out.println("The volume of the block is " + length + " x " + width + " x " + height + " is " + volumeOfBlock); //outputs the volume of the block
    }
}