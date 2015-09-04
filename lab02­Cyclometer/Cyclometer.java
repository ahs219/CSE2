//Author: Andrew Steinberg
//Date: September 4, 2015
//Purpose: To create a program that measures speed, distance, etc. for a bicycle

public class Cyclometer
{
    //main method which is required for all java program
    public static void main (String[] args)
   // end of main method
    {
        // our input data
        
        int secsTrip1=480; // represents the time of trip 1 in seconds
        int secsTrip2=3220; // represents the time of trip 2 in seconds
        int countsTrip1=1561; // represents number of counts(rotations) for trip 1
        int countsTrip2=9037; // represents number of counts(rotations) for trip 2
        
        double wheelDiameter=27.0; // represents the diameter of the wheel of the bicycle
        double PI=3.14159;// connstant value for PI
        int feetPerMile=5280; // constant for how the number of feet in a mile
        int  inchesPerFoot=12;// constant for the number of inches in a foot
        int secondsPerMinute=60;
        double distanceTrip1, distanceTrip2, totalDistance; //these variables are initialized so that we can later store them with values
        
        //prints out the numbers I stored in the variables that store number of seconds and the counts
        
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
        
        //run calculations
        
        distanceTrip1=countsTrip1*wheelDiameter*PI; //gives distance in inches
        distanceTrip1/=inchesPerFoot*feetPerMile; // gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        //print out output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); 
        System.out.println("Trip 2 was "+distanceTrip2+" miles"); 
        System.out.println("The total distance was "+totalDistance+" miles");
        
    }
}