
package Day1;

public class BaseOneclass {
		
		boolean limitcheck(int cutoffmaths ,int cutoffphysics,int cutoffchemistry) {
			
		float average = (cutoffmaths + cutoffchemistry + cutoffphysics)/3 ;
			
			if(average > 75 ) {
				System.out.println("print eligible");
				return true ;
			}
			else
			{
				System.out.println("print not eligible");
				return false;
			}
		}
		
		static int compare(String v1, String v2)
		{
		    if (v1 == null || v2 == null) throw new NullPointerException("Version cannot be null");

		    /* TODO: Use a split iterator to not calculate everything in advance. */
		    String[] args1 = v1.split("\\.");
		    String[] args2 = v2.split("\\.");
		    System.out.println("I am in compare");

		    for (int i = 0 ; i < args1.length && i < args2.length ; i++)
		    {
		        int comp = args1[i].compareTo(args2[i]);
		        if (comp != 0)
		        	return comp;
		    }

		    if (args1.length == args2.length) return 0;

		    return args1.length > args2.length ? 1 : -1;
		}
		
		public static void main(String[] args) {
			
			
		int check =	BaseOneclass.compare("4.102.2","4.103.3");
		System.out.println(check);
		}
		
	}
