
package Day2;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import org.junit.Assert;




public class Junitprime extends PrimeorNot {

	
	@DisplayName("positve test case")
	@Test
	@ParameterizedTest
	@ValueSource(ints = {9, 3, 5,7})
	public void testcheck(int num)
	{
		
		boolean primecheck = primeCheck(num);
		Assert.assertEquals(true, primecheck);
	}
	
//	@DisplayName("negative test case")
//	@Test
//	public void primeCheck()
//	{
//		
//		boolean primecheck = primeCheck(2);
//		Assert.assertEquals(primecheck, true);
//	}
	
	
	
}
