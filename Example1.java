package methods;

public class Example1 {
	//creating the static method 
	public static void evenodd(int num) {
		// check the condition for number is even or odd
		if(num%2==0)
		{
			System.out.println(num + " is even number");
		}else
		{
			System.out.println(num + " id odd number");
		}
	}
	//here is main method
	public static void main(String[] args) {
		// return type
		evenodd(10);

	}

}
