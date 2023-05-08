package day3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public class Duplicateremoval {
	
	
//	public List<Integer> RemoveDuplicate(List<Integer> numList)
//	{
//		
//		
//		return numList;
//	}

//	public static void main(String[] args) {
//		System.out.println("Enter n value :");
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int [] arr = new int [n];
//		
//		System.out.println("Enter "+ n + "values:");
//
//		
//		for(int i = 0 ; i<arr.length ; i++)
//		{
//			arr[i] = in.nextInt();
//
//		}
//		System.out.println(Arrays.toString(arr));		
//}
	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("I am in main");
//		System.out.println("Enter n value :");

		List<Integer> li = new ArrayList<Integer>();
		li.add(4);
		li.add(8);
		li.add(9);
		li.add(4);
		li.add(10);
		li.add(8);
		System.out.println(li);
		Set<Integer> set = new LinkedHashSet<Integer>(li);
		List<Integer> nlist = new ArrayList<Integer>();

		for(int i : set)
		{
			nlist.add(i);
		}
		System.out.println(nlist);

		
		
		

		
	}
	
}
