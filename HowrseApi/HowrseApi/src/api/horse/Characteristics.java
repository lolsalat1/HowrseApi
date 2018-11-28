package api.horse;

/**
 * 	Race, Species, Gender, Hide, Breeder, Age, Size, Weight, Birthday, Inventory
 */
public class Characteristics {

	/**
	 * Race
	 * <br>
	 * (String, because there are just to many and Java 8 allows switch(String) )
	 */
	public String Race;
	
	/**
	 * Species
	 * <br>
	 * (String, because -> {@link #Race} )
	 */
	public String Species;
	
	/**
	 * Gender
	 */
	public GENDER gender;
	
}
