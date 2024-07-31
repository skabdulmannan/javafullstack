package scannerclass;
import java.util.Scanner;
public class Palindrone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			//enter the number by the user
		System.out.println("Enter the number : ");
		
		  int n = in.nextInt();//It is the number variable to be checked for palindrome  
		  int r,sum=0;
		  int temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println( temp+ "palindrome number ");    
		  else    
		   System.out.println( temp+ "not palindrome");    

	}

}
