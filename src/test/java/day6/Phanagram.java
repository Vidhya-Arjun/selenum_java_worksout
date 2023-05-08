package day6;

public class Phanagram {
//	public static void main(String[] args) {
//		
//		isnotLetter('1');
//	}
//static boolean isnotLetter(char a) {
//	
//	if(!Character.isLetter(a))
//	{
//		System.out.println("true");
//		return true;
//	}
//	System.out.println("false");
//
//	return false;
//}
    public static void
    allLetter(String str)
    {
        // Converting the given string
        // into lowercase
        str = str.toLowerCase();
 
        boolean allLetterPresent = true;
 
        // Loop over each character itself
        for (char ch = 'a'; ch <= 'z'; ch++) {
 
            // Check if the string does not
            // contains all the letters
            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }
 
        // Check if all letter present then
        // print "Yes", else print "No"
        if (allLetterPresent)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
 
    // Driver Code
    public static void main(String args[])
    {
        // Given string str
        String str = "Acdefghijklmnopqrstuvwxyz12";
 
        // Function call
        allLetter(str);
    }

	
}
