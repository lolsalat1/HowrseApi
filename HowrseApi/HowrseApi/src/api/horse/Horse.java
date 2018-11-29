package api.horse;

import java.util.Set;

/**
 * Howrse is all about horses :)
 */
public class Horse {

	// TODO Care, Night, Rideout, Training, Competitions, Breeding, EquestrianCenter
	
	/**
	 * Id and name is enough at first, and if you want more the id does a great job
	 */
	public Horse(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	/**
	 * Name of the cutie ;)
	 */
	public String name;
	
	/**
	 * Id of the loved one
	 */
	public int id;
	
	/**
	 * Status of the horse
	 */
	public Status status;
	
	/**
	 * Skills of the horse
	 */
	public Skills skills;
	
	/**
	 * Genetics of the horse
	 */
	public Genetics genetics;
	
	/**
	 * Characteristics of the horse
	 */
	public Characteristics characteristics;
	
	/**
	 * Tasks
	 */
	public Tasks tasks;
	
	/**
	 * Boni the horse enjoys
	 */
	public Set<Bonus> boni;
}
