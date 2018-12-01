package api.horse;

public class Genetics {

	public Genetics() {
		potential = new Skills();
		excellence = new Skills();
	}
	
	/**
	 * Potential
	 */
	public Skills potential;
	
	/**
	 * BLUP ?!!
	 */
	public float blup;
	
	/**
	 * Race of dad
	 */
	public String dad;
	
	/**
	 * Race of mom
	 */
	public String mom;
	
	/**
	 * Race
	 */
	public String race;
	
	/**
	 * Excellence
	 */
	public Skills excellence;
	
}
