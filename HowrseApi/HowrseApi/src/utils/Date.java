package utils;

/**
 * Well it's just a Day 
 */
public class Date {

	/**
	 * How many days does February have? ...
	 */
	public static int[] DAYS = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	/**
	 * Year
	 */
	public int year;
	
	/**
	 * Month
	 */
	public int month;
	
	
	/**
	 * Day
	 */
	public int day;
	
	/**
	 * It's dangerous to calculate alone, take this!
	 */
	public void normalize() {
		while(month > 12) {
			year ++;
			month -= 12;
		}
		while(day > DAYS[month]) {
			day --;
			month ++;
			if(month > 12) {
				month -= 12;
				year ++;
			}
		}
		
	}
	
	/**
	 * Adds another date
	 */
	public void add(Date date) {
		day += date.day;
		month += date.month;
		year += date.year;
		normalize();
	}
	
	/**
	 * Adds another date
	 */
	public void add(int days, int months, int years) {
		day += days;
		month += months;
		years += years;
		normalize();
	}
	
}
