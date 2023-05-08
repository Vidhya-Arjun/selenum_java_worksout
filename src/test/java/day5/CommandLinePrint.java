package day5;

public class CommandLinePrint {
	public static void main(String[] args) {
		System.out.println("args" + args);
		for(int i = 0 ; i<3 ; i++)
		{
			System.out.println(String.format("command line argument %d is %s ", i,args[i]));
		}
		

	}

}
