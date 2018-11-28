package api.horse;


/**
 * Stamina, Speed, Dressage, Gallop, Trot, Jump
 */
public class Skills {

	/**
	 * Stamina
	 */
	public float stamina;
	
	/**
	 * Speed
	 */
	public float speed;
	
	/**
	 * Dressage
	 */
	public float dressage;
	
	/**
	 * Gallop
	 */
	public float gallop;
	
	/**
	 * Trot
	 */
	public float trot;
	
	/**
	 * Jump
	 */
	public float jump;
	
	/**
	 * Total
	 */
	public float Total() {
		return stamina + speed + dressage + gallop + trot + jump;
	}
}
