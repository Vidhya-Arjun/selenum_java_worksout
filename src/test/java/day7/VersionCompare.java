package day7;

import java.util.ArrayList;
import java.util.List;

public class VersionCompare {

	static void compMethod(String st1,String st2)
	{
		String[] stringsplit1 = st1.split("\\.");
		String[] stringsplit2 = st2.split("\\.");
		int count = 0;
		for(int i = 0; i< stringsplit1.length;i++)
	    {
	    	int versionofstring1 = Integer.parseInt(stringsplit1[i]);
	    	int versionofstring2 = Integer.parseInt(stringsplit2[i]);
	    	if(versionofstring1 > versionofstring2)
	    	{
	    		System.out.println("version 1 greater");
	    		break;   		
	    	}
	    	else if(versionofstring1 == versionofstring2)
	    	{
	    		count += 1;
	    		continue;
	    	}
	    	else
	    		System.out.println("version 2 greater");
	    }
		if(count == stringsplit1.length)
		{
			System.out.println("both version are similar");
		}
	}
	
	public static void main(String[] args) {
		
		String st1 = "10.3.1.2";
		String st2 = "10.3.1.2";
		compMethod(st1,st2);
		
		
	}
}
