import java.util.Scanner;
//importing the scanner class
public class Rectangle{
    //declaring variables
    double width;
    double height;
    //method that takes double as an argument and sets the value of width
    public void setWidth(double x){
        width = x;
    }
    //method that takes a double and sets the value of height
    public void setHeight (double y){
        height = y;
    }
    //method that takes no argument and returns the product of height and width
    public double getArea(){
        double product = width * height;
        return product;
    }
    //main method
    public static void main(String[]args){
        //declaring the variable
        Rectangle r1 = new Rectangle();
        //using setHeight and setWidth to initialize the height and width
        r1.setHeight(5.3);
        r1.setWidth(7.3);
        //printing the area
        System.out.println(r1.getArea());
    
    }
}