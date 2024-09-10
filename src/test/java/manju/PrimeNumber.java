package manju;

public class PrimeNumber {
	public static void main(String[] args) {
		/**
		 * two factors
		 */
		int i=20;
		int count=0;
		for(int n=1; n<=i; n++)
		{
			if (i%n==0) 
			{
				count++;
				
				
			}
			
		}
		if (count==2) {
			System.out.println("prime number");
			
		}
		else {
			System.out.println("not a prime number");
		}
		
		
	}

}
