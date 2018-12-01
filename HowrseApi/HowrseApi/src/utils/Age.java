package utils;

/**
 * How old are you?
 */
public class Age {

	public Age(int months) {
		add(months);
	}
	
	/**
	 * Years
	 */
	public int years;
	
	/**
	 * Months
	 */
	public int months;
	
	/**
	 * increases the age by some months (be careful! this might kill someone!)
	 */
	public void add(int months) {
		this.months += months;
		while(this.months >= 12) {
			this.years ++;
			this.months -= 12;
		}
	}
	
	/**
	 * Increases the age by some years and months (not forever young :( )
	 */
	public void add(int years, int months) {
		this.years += years;
		add(months); // ya I'm lazy
	}

	@Override
	public String toString() {
		return "Age [years=" + years + ", months=" + months + "]";
	}
	
	
}
