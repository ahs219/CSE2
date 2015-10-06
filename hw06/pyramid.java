//Title: HW 06 - pyramid.java
//Author: Andrew Steinberg
//Purpose: Using user input to print a pyramid of stars

import java.util.Scanner;
public class pyramid
{
    public static void main (String[] args)
  {

  Scanner myScanner = new Scanner(System.in);
  
  System.out.println("What size Pyramid");//prompts user for size of pyramid
  
  int sizeOfPyramid = myScanner.nextInt();
      
      for(int i = 0; i < sizeOfPyramid; i++) //nested for loop that allows the pyramid to have the correct spacing with the lines
      {
          for(int j = 0; j < sizeOfPyramid - i; j++) //nested for loop
          {
              System.out.print(" ");//needed for spacing
          }
         
         for(int a = 0 ; a <= i; a++) //this for loop actually prints the stars of the pyramid
         {
             System.out.print(" *");
         }
         
         System.out.println(); //needed for spacing
     }

}

}