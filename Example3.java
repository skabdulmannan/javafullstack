package methods;
import java.util.Scanner;
public class Example3 {
	//creating the method.
	public static int sum(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	//here is the main method.
	public static void main(String[] args) {
		// creating the Scanner object.
		Scanner mn  = new Scanner(System.in);
		// create the variables.
		System.out.print("Enter the number a : ");
		int a = mn.nextInt();
		
		System.out.print("Enter the number b : ");
		int b = mn.nextInt();
		// calculate the sum.
		int c = sum(a,b);
		System.out.println("sum of"+a+"and"+b+" is : "+c);
		
		//checking the result c is positive or not.
		if(c>0)
		{
			System.out.print(c+ " is positive.");
		}else if(c<0)
		{
			System.out.print(c+ " is negative ");
		}else
		{
			System.out.print(c+ " is zero");
		}

	}

}
