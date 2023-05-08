package Day1;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class test {
	
	
	@Test
	public void testing()
	{
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter your maths mark");
//		int maths = obj.nextInt();
//		System.out.println("Enter your physics mark");
//		int physics = obj.nextInt();
//		System.out.println("Enter your chemistry mark");
//		int chemistry = obj.nextInt();
//		System.out.println("In testcase1");
		int maths = 50;
		int physics = 50;
		int chemistry = 50;
		BaseOneclass obj = new BaseOneclass();
		boolean result = obj.limitcheck(maths, physics, chemistry);
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testing2()
	{
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter your maths mark");
//		int maths = obj.nextInt();
//		System.out.println("Enter your physics mark");
//		int physics = obj.nextInt();
//		System.out.println("Enter your chemistry mark");
//		int chemistry = obj.nextInt();
//		System.out.println("In testcase1");
		int maths = 90;
		int physics = 70;
		int chemistry = 80;
		BaseOneclass obj = new BaseOneclass();
		
		boolean result = obj.limitcheck(maths, physics, chemistry);
		Assert.assertEquals(true, result);
	}	

}
