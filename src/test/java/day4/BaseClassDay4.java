package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BaseClassDay4 {
	
	
	public static List<Integer> ListDuplicate(List<Integer> list,int n) {
		
		System.out.println("inside function");
		
		Set<Integer> set = new LinkedHashSet<Integer>(list);
		List<Integer> nlist = new ArrayList<Integer>(n);

		for(int i : set)
		{
			nlist.add(i);
		}

		
		return nlist;
		
	}

	public static void main(String[] args) {
		BaseClassDay4 bd = new BaseClassDay4();
		List<Integer> li = new ArrayList<Integer>();

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int size = in.nextInt();
		System.out.println("size" +size);

		System.out.println("Enter the values to be filled in array");
		for(int j =0 ; j<=size-1 ; j++)
		{
			li.add(in.nextInt());
		}		
		
		System.out.println(bd.ListDuplicate(li,size));
	}
}
