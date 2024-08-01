package loopingstate;
import java.util.Scanner;
public class numbersequnce {

	public static void main(String[] args) {
		//using the scanner 
		Scanner ab = new Scanner(System.in);
		//Entering the number by user.
		System.out.println("Enter the table number:");
		// initialization of numbers
		int a = ab.nextInt();
		int i;
		// using the looping conditions
		for(i=1;i<=20;i++)
		{
			//statement should be print here
			System.out.println(a+"*"+i+"="+ i*a);
		}

	}

}
