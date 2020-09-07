package TstNGUnitFrameWork.Annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	@Test
	public void browser() {
		SoftAssert sa= new SoftAssert();
		System.out.println("Start Execution");
		
		String expcRes="Facebook";
		String actualRes="Google";
		sa.assertEquals(expcRes, actualRes,"Mismatch in Title");//can add msg
	
	System.out.println("End Execution");
	sa.assertAll();
	}

}
