package day3;
import java.util.*; 

public class Listip {


	 
	    public static void main(String[] args) { 
	        Scanner reader = new Scanner(System.in); 
	        ArrayList<String> memory = new ArrayList<String>(); 
	         
	        while(true) 
	        { 
	            memory.add(reader.nextLine()); 
	            System.out.println(memory.toString()); 
	        } 
	    } 
	} 