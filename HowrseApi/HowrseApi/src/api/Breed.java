package api;

import java.util.HashMap;

import api.horse.Horse;

/**
 * As far as I know, you can manage your horses using breeds
 */
public class Breed {

	/**
	 * Id
	 */
	public int Id;
	
	/**
	 * Name
	 */
	public String name;
	
	/**
	 * Horses
	 */
	public HashMap<Integer, Horse> horses;
	
}
