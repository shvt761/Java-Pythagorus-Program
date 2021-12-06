import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double x;
		double y;
		double z;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Perpendicular Distance : ");
		x=scanner.nextDouble();
		System.out.println("Enter the Base Distance : ");
		y=scanner.nextDouble();
		z=Math.sqrt((x*x)+(y*y));
		System.out.println("The Hypotenuse of the Given Triangle is : "+z);
		scanner.close();
	}

} 
