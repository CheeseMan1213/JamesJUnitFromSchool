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

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Test_Problem_1_setWarnings {
	
	private Problem_1_setWarnings WarnObject;
	
	private static final Object[] parametersForTest_Problem_1_setWarnings() {
		return $(
				//Parameters are: (1, 2, 3, 4, 5, 6)
				//1 = distance, 2 = redLight, 3 = yellowLight, 4 = greenLight, 5 = buzzer, 6 = breaks
				
				//Test Case 1
				$ (200.0, false, false, true, false, false),
				/*//Test Case 2
				$ (200.0, false, false, true, false, false),
				//Test Case 3
				$ (200.0, false, false, true, false, false),
				//Test Case 4
				$ (200.0, false, false, true, false, false),
				//Test Case 5
				$ (200.0, false, false, true, false, false),
				//Test Case 6
				$ (200.0, false, false, true, false, false),
				//Test Case 7
				$ (200.0, false, false, true, false, false),
				//Test Case 8
				$ (200.0, false, false, true, false, false)*/
				
				//);
	}
}
