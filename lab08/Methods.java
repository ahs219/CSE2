import java.util.Scanner;

public class Methods{
	public static double mean(double x){
		double tot = x/10;
		return tot;
	}
	public static double median(double x, double y){
		double med = (x+y)/2;
		return med;
	}
	public static void print(double x, double y){
		
		System.out.println("The mean of the set is " + x + ", and the median is " + y + ".");
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 numbers in ascending order.");
		double first = scan.nextDouble();
		double second = scan.nextDouble();
		double third = scan.nextDouble();
		double fourth = scan.nextDouble();
		double fifth = scan.nextDouble();
		double sixth = scan.nextDouble();
		double seventh = scan.nextDouble();
		double eighth = scan.nextDouble();
		double ninth = scan.nextDouble();
		double tenth = scan.nextDouble();
		double total = (first+second+third+fourth+fifth+sixth+seventh+eighth+ninth+tenth);
		double meanRes = mean(total);
		double mediRes = median(fifth, sixth);
		print(meanRes, mediRes);
    }
}






