package api.horse;


/**
 * Stamina, Speed, Dressage, Gallop, Trot, Jump
 */
public class Skills {

	/**
	 * Stamina
	 */
	public float Stamina;
	
	/**
	 * Speed
	 */
	public float Speed;
	
	/**
	 * Dressage
	 */
	public float Dressage;
	
	/**
	 * Gallop
	 */
	public float Gallop;
	
	/**
	 * Trot
	 */
	public float Trot;
	
	/**
	 * Jump
	 */
	public float Jump;
	
	/**
	 * Total
	 */
	public float Total() {
		return Stamina + Speed + Dressage + Gallop + Trot + Jump;
	}
}
