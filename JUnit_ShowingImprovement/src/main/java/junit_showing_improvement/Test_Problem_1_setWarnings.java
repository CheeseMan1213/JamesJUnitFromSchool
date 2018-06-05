/*James Hawley
 * 20180605Tue
 * 
 *This is me taking some code from college and reviewing some things I learned in college. 
 *This stuff is from my Software Testing class.
 *
 *I will be showing myself, and maybe later others, some improvements made to JUnit over the years
 *I took pictures of source code at home on my phone and looked at those pictures on my phone at work.
 *
 * Works Cited:
 * --My own HW assignments
 * --My teacher's practice code*/
package junit_showing_improvement;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import  junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Test_Problem_1_setWarnings {
	
	private Problem_1_setWarnings warnObject;
	
	private static final Object[] parametersForTest_Problem_1_setWarnings() {
		//return new Object[] {  new object[] {200.0, false, false, true, false, false}, new Object[] {200.0, false, false, true, false, false}  };
		
		//**You Need the import = import static junitparams.JUnitParamsRunner.$;
				
				
				return $(
						//Parameters are: (1, 2, 3, 4, 5, 6)
						//1 = distance, 2 = redLight, 3 = yellowLight, 4 = greenLight, 5 = buzzer, 6 = breaks
						
				//Test Case 1
				$(200.0, false, false, true, false, false),
				//Test Case 2
				$ (75.1, false, true, false, false, false),
				//Test Case 3
				$ (25.0, true, true, false, false, false),
				//Test Case 4
				$ (24.9, true, true, false, true, true),
				//Test Case 5
				$ (300.0, false, false, true, false, false),
				//Test Case 6
				$ (199.9, false, true, false, false, false),
				//Test Case 7
				$ (75.0, true, true, false, false, false),
				//Test Case 8
				$ (-0.1, true, true, false, true, true)
				);
	}
	@Before
	public void setUp() {
		warnObject = new Problem_1_setWarnings();
	}
	@Test
	@Parameters(method="parametersForTest_Problem_1_setWarnings")
	public void test(Double distance, Boolean redLight, Boolean yellowLight, Boolean greenLight, Boolean buzzer, Boolean breaks) {
		warnObject.setWarnings(distance);
	}
}
