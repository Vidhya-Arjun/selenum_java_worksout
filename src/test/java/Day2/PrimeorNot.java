package Day2;


public class PrimeorNot {
	
	 boolean primeCheck(int num) {
		
		int count = 0;
		
		
			if(num ==0||num==1)
			{	
				System.out.println("0 or 1 is neither prime nor composite Enter a valid number");
			}
				for (int i = 2; i<= num/2 ; i++ )
				{
					int modvalue = num % i ;
					if(modvalue == 0)
					{
						count += 1;
					}
			
				}
		
			if(count==0)
			{
				return true;
			}
			else
				return false;
			
			
	}
}
