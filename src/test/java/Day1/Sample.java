package Day1;


public class Sample {
	
	static boolean limitcheck(int cutoffmaths ,int cutoffphysics,int cutoffchemistry) {
		
	float average = (cutoffmaths + cutoffchemistry + cutoffphysics)/3 ;
		
		if(average > 50 ) {
			System.out.println("print eligible");
			return true ;
		}
		else
		{
			System.out.println("print not eligible");
			return false;
		}		
		
	}
	
	
}
