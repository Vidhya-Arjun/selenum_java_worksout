package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class JunitFrameTest {

	
	@Test
	public void stringDupTest()
	{
	//Arrange
	
	List<Integer> listA = new ArrayList<Integer>(Arrays.asList(21,1,2,3,4));
	List<Integer> listB = new ArrayList<Integer>(Arrays.asList(22,1));
	List<Integer> listconcat = new ArrayList<Integer>();
	List<Integer> expectedlistconcat = new ArrayList<Integer>(Arrays.asList(1,2,3,4,21,22));
	
	//Execute
	
	listconcat.addAll(listA);
	listconcat.addAll(listB);
	
	
	Set<Integer> set = new TreeSet<Integer>(listconcat);
	List<Integer> nlist = new ArrayList<Integer>();

	for(int i : set)
	{
		nlist.add(i);
	}


	System.out.println(nlist);
	System.out.println(expectedlistconcat);

	
	//Assert
	Assert.assertArrayEquals(expectedlistconcat.toArray(), nlist.toArray());
	}
}
