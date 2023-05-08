package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class UnionProgram {
	public static void main(String[] args) {
		List<Integer> listA = new ArrayList<Integer>(Arrays.asList(21,1,2,3,4));
		List<Integer> listB = new ArrayList<Integer>(Arrays.asList(22,1));
		List<Integer> listconcat = new ArrayList<Integer>();
		
		
		listconcat.addAll(listA);
		listconcat.addAll(listB);
		
		
		System.out.println(listconcat);
		Set<Integer> set = new HashSet<Integer>(listconcat);
		List<Integer> listresult = new ArrayList<Integer>();

		for(int i : set)
		{
			listresult.add(i);
		}
		
		System.out.println(listresult);
		System.out.println(listresult.size());

	}


}
