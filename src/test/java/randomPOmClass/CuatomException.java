package randomPOmClass;

import java.util.Scanner;

public class CuatomException {
	public static void main(String[] args) {
		int aBal=1000;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value");
		int amount = sc.nextInt();
		if (amount<=aBal) {
			System.out.println("success");
			
		}
		else
		{
			try
			{
				InsufficientBalance obj = new InsufficientBalance();
				throw obj;
			}
			catch (InsufficientBalance e) {
				System.out.println("insufficient amount");
			}
		}
		
	 
	}

}
