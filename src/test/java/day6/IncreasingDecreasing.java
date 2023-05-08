package day6;

public class IncreasingDecreasing {

	
	
	static boolean isIncreasing(int Num) {
		boolean flag = true;
		
		 String string_convert = Integer.toString(Num);
		 char digit ;
		 flag = true;

		 for(int i = 0; i<=string_convert.length()-1; i++ )
		 {
			 digit = string_convert.charAt(i);
			 if(digit>string_convert.charAt(i+1))
			 {
				 System.out.println("In loop");

				 int next = i +1;
				 System.out.println("i"+ i +" "+ digit);
				 System.out.println("i"+next +" " + string_convert.charAt(i+1));
				 flag = false;
				 break;
			 }
		 }
		 System.out.println("I am increasing");

		return flag;
		

	}
	static void Increaingornot(int N) {
		
		System.out.println("I am in");
		
		 String newInt = Integer.toString(N);
		 System.out.println(newInt);
		 
		 for(int i = 0 ;i<=newInt.length()-1; i++)
		 {
			 System.out.println("inside for loop" + i);

			 if(i==0)
			 {
				 int next = i+1;
				 
				 if(next<newInt.length())
				 {
					 if(newInt.charAt(i) < newInt.charAt(next))
					 {
						 
						 
						 System.out.println("I am increasing");
						 System.out.println(i + newInt.charAt(i));
						 System.out.println(i + newInt.charAt(next));

 
					 }
					 else if(newInt.charAt(i) > newInt.charAt(next))
					 {
						 System.out.println("I am decreasing");
						 System.out.println(i + newInt.charAt(i));
						 System.out.println(i + newInt.charAt(next));


					}	 
					else 
						 System.out.println("I am neither increasing nor decreasing");

				 }
			 }

		 }

		

	}
	
	public static void main(String[] args) {
		isIncreasing(1234);
	}
}
