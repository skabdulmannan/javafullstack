package javaprograms;
import java.util.Scanner;
//---defining the class for the circle---
class Circle
{
	//---create the variables---
	private float radius,py;
	//input the data through users.
	public void insideradius()
	{
		Scanner mn = new Scanner(System.in);
		//create the objects 
		System.out.println("Emter the radius of circle : ");
		radius =mn.nextFloat();
		System.out.println("Enter the py values of circle: ");
		py = mn.nextFloat();
	}
	//--display the data
	public void displaydata()
	{
		//display the data
		System.out.println("--------------------------------");
		System.out.println("----Circle------");
		System.out.println("radius of cirlce is : "+radius);
		System.out.println("py value of circle : "+py);
		
	}
	// area of circle
	public void area()
	{
		float area;
		area = py*radius*radius;
		System.out.println("area of circle is : "+area);
	}
	//perimeter of circle
	public void perimeter()
	{
		float perimeter;
		perimeter = 2*py*radius;
		System.out.println("perimeter of cirlce is : "+perimeter);
		
	}
}
public class Circleoperation {

	public static void main(String[] args) {
		// create the object for class
		Circle cir = new Circle();
		cir.insideradius();
		cir.displaydata();
		cir.area();
		cir.perimeter();

	}

}
