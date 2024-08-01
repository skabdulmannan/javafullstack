package methods;
import java.util.Scanner;
public class Example2 {
	//creating the method.
	public static void oddeven(int num)
	{
		//checking the condition even or odd
		if(num%2==0)
		{
			System.out.println(num+ "is even number");
		}else
		{
			System.out.println(num+ "id odd number");
		}
	}
	//main method
	public static void main(String[] args) {
		//creating the Scanner method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		//give the number by keyboard.
		int num = sc.nextInt();
		//method is calling.
		oddeven(num);

	}

}
