package controlstate;

public class Greater3 {
	public static void main(String[] args) {
		int a=500;
		int b=750;
		int c=600;
				if(a>b) {
					if(a>c) {
						System.out.println(a+" is greater");
					}
					else {
						System.out.println(c+" is greater");
					}
				}
				else {
					if(b>c) {
						System.out.println(b+" is greater");
					}
					else {
						System.out.print(c+" is greater");
					}
				}

			}

		}
