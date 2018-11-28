package api.horse;

import api.player.Player;
import utils.Age;
import utils.Date;

/**
 * 	Race, Species, Gender, Hide, Breeder, Age, Size, Weight, Birthday, Inventory
 */
public class Characteristics {

	/**
	 * Race
	 * <br>
	 * (String, because there are just to many and Java 8 allows switch(String) )
	 */
	public String race;
	
	/**
	 * Species
	 * <br>
	 * (String, because -> {@link #Race} )
	 */
	public String species;
	
	/**
	 * Gender
	 */
	public Gender gender;
	
	/**
	 * Hide
	 * <br>
	 * (String, because -> {@link #Race} )
	 */
	public String hide;
	
	
	/**
	 * Breeder
	 */
	public Player breeder;
	
	/**
	 * Age
	 */
	public Age age;
	
	/**
	 * Size
	 */
	public int size;
	
	/**
	 * Weight
	 */
	public int weight;
	
	/**
	 * Birthday
	 */
	public Date birthday;

	/**
	 * Inventory
	 */
	public Inventory inventory;
}