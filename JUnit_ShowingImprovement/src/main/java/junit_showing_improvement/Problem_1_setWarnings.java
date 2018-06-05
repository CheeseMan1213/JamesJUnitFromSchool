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

//This is the class this I am testing
public class Problem_1_setWarnings {
	
	private Boolean  breaks; 
	private Boolean  redLight;
	private Boolean  yellowLight;
	private Boolean  greenLight;
	private Boolean  buzzer;
	
	public void setWarnings(Double distance) {
		
		breaks = false;
		redLight = false;
		yellowLight = false;
		greenLight = false;
		buzzer = false;
		
		if(distance >= 200.0) {
			greenLight = true;
		}
		else {
			if(distance > 75.0) {
				yellowLight = true;
			}
			else {
				if(distance >= 25.0) {
					redLight = true;
					yellowLight = true;
				}
				else {
					breaks = true;
					redLight = true;
					yellowLight = true;
					buzzer = true;
				}
			}
		}
	}

	public Boolean isBreaks() {
		return breaks;
	}

	public void setBreaks(Boolean breaks) {
		this.breaks = breaks;
	}

	public Boolean isRedLight() {
		return redLight;
	}

	public void setRedLight(Boolean redLight) {
		this.redLight = redLight;
	}

	public Boolean isYellowLight() {
		return yellowLight;
	}

	public void setYellowLight(Boolean yellowLight) {
		this.yellowLight = yellowLight;
	}

	public Boolean isGreenLight() {
		return greenLight;
	}

	public void setGreenLight(Boolean greenLight) {
		this.greenLight = greenLight;
	}

	public Boolean isBuzzer() {
		return buzzer;
	}

	public void setBuzzer(Boolean buzzer) {
		this.buzzer = buzzer;
	}
	
}
