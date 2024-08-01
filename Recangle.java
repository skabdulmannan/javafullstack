package methods;
import java.util.Scanner;
public class Recangle {
	//creating the method.
	public static void area(float l, float b)
	{
		float area;
		area = l*b;
		System.out.println("Area of rectangle is : " +area);
	}
	public static void perimeter(float l, float b) 
	{
		float perimeter;
		perimeter = 2*(l+b);
		System.out.println("Area of pertmeter is : " +perimeter);
	}

	public static void main(String[] args) {
		// creating the object class
		Scanner sc = new Scanner(System.in);
		// inputs of Scanner class.
		System.out.print("Enter the length of rectangle : ");
		float l = sc.nextFloat();
		
		System.out.print("Enter the breadth of rectangle : ");
		float b = sc.nextFloat();
		//calculate the area of rectangle.
		area(l,b);
		perimeter(l,b);
	}

}
