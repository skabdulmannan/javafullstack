package loopingstate;
import java.util.Scanner;
public class Numericalculator {

	public static void main(String[] args) {
		// creating the scanner class.
		Scanner mn = new Scanner(System.in);
		
		//creating the two variable to store numbers.
		int num1, num2;
		int choice;//variable to decide to whether operations should continue or not.
		do {
				
				//user should give the inputs.
				System.out.print("Enter 1st number : ");
				num1 = mn.nextInt();
				System.out.print("Enter 2nd number : ");
				num2 = mn.nextInt();
		
				//Displaying the Menu for the user/
				System.out.println("-----------------------------------------");
				System.out.println("-----------Numeric Calculator------------");
				System.out.println("-----------------------------------------");
				System.out.println("1. Addition");
				System.out.println("2. Difference");
				System.out.println("3. Product");
				System.out.println("4. Division");
				System.out.println("-----------------------------------------");
		
				//Ask the user to select any one operation.
				System.out.print("select any one operation: ");
				int operation = mn.nextInt();
				//performing the operation as per the selection.
				switch(operation)
				{
				case 1: System.out.println("----Addition operation----");
						System.out.println("Sum of " +num1+ " and " +num2+ "is : "+(num1+num2));
						break;
				case 2: System.out.println("----Difference operation----");
						System.out.println("Diff of " +num1+ " and " +num2+ "is : "+(num1-num2));
						break;
				case 3: System.out.println("----Product operation----");
						System.out.println("product of " +num1+ " and " +num2+ "is : "+(num1*num2));
						break;
				case 4: System.out.println("----Dividion operation----");
						System.out.println("division of " +num1+ " and " +num2+ "is : ");
						System.out.println("quotient = "+(num1/num2));
						System.out.println("remainder = "+(num1%num2));
						break;
				default: System.out.println("Invalid operation");
				}
				System.out.println("-------------------------------------------------------");
				//user wants to continue or terminate the operation.
				System.out.println("Press the 0 to terminate or anyother number to continue:  ");
				choice = mn.nextInt();
				System.out.println("----------------------------------------");
			}while(choice!=0);
	}	   
}
