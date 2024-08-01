package javaprograms;
import java.util.Scanner;
//-----defining a class for rectangle----
class Rectangle
{
	//----Member variables----
	private float len,bread;
	//input of data through user.
	public void inputsides()
	{
		//----creating the object of scanner class----
		Scanner sc = new Scanner(System.in);
		//----input of data through keyboard----
		System.out.print("Enter length of rectangle(in cm) : ");
		len = sc.nextFloat();
		System.out.print("Enter breadth of rectangle(in cm) : ");
		bread = sc.nextFloat();
	}
	//----methods to display data----
	public void displaysides()
	{
		System.out.println("------------------------------------");
		System.out.println("----Rectange-----");
		System.out.println("length : "+len+"cm");
		System.out.println("breadth : "+bread+"cm");
	}
	//----method to calculate perimeter----
	public void perimeter()
	{
		float p;//variable to store the data
		p = 2*(len + bread);
		System.out.println("Perimeter : "+p+"cm");
	}
	//---method to calculate the area---
	public void area()
	{
		float area;//variable to store the data
		area = len * bread;
		System.out.println("Area is : "+area+"sq.cm");
	}
}
//-----------------Initial class-------------
public class Recatangleoperation {

	public static void main(String[] args) 
	{
		//creating the object for the rectangle.
		Rectangle  rectobj = new Rectangle();
		//---method to input of sides----
		rectobj.inputsides();
		//----method to display the side of rectangle---
		rectobj.displaysides();
		//----method to calculate the perimeter---
		rectobj.perimeter();
		//---method to calculate the area of rectangle---
		rectobj.area();
	}

}
