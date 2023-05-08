package Day1;

import java.util.Scanner;

public class BaseClass {
	
	static void Primenumbergeneration()
	{
		int count = 0 ;
		Scanner inobj = new Scanner(System.in);
		System.out.println("Enter the range for prime number generation");
		int n = inobj.nextInt(); 
		for(int i = 1; i< n ; i++)
		{
			if(i== 1)
			{
				System.out.println("1 is neither prime nor composite");
			}
			System.out.println(i);
			
			if(n%i == 0)
			{
				count += 1;
				System.out.println("count & i" +count+" " +i);
			}
		}
		
		
	}
	public static void main(String[] args) {
		BaseClass.Primenumbergeneration();
	}
	

}
