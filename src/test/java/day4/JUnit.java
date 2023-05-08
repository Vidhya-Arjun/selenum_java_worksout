package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import org.junit.Assert;

public class JUnit extends BaseClassDay4{
	
	@DisplayName("Remove Duplicate testcase")
	@Test
	public void RemoveDup()
	{
		//Arrange
		
		//int[] inputArray = new int[] {1,1,1,2,3,4};
		List<Integer> input = new ArrayList<>(Arrays.asList(2,1,2,3,1,4));
		
		List<Integer> expectedresult = new ArrayList<Integer>(4);
		expectedresult.add(1);
		expectedresult.add(2);
		expectedresult.add(3);
		expectedresult.add(4);
		
		// Execute
		List<Integer> actualResult = BaseClassDay4.ListDuplicate(input, 6);
		
		// Assert
		Assert.assertEquals(expectedresult.size(), actualResult.size());
		Assert.assertArrayEquals(expectedresult.toArray(), actualResult.toArray());
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the length of array");
//		int size = in.nextInt();
//		
//
//		System.out.println("size" +size);
//
//		System.out.println("Enter the values to be filled in array");
//		for(int j =0 ; j<=size-1 ; j++)
//		{
//			actualresult.add(in.nextInt());
//		}
//		
//		BaseClassDay4.ListDuplicate(actualresult, size);
		
		
				
		
//		boolean result = actualresult.equals(expectedresult);
//		
//		Assert.assertEquals(false, result);
		
	}
}