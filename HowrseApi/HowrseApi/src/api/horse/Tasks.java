package api.horse;

import api.horse.task.Age;
import api.horse.task.Carrot;
import api.horse.task.Drink;
import api.horse.task.Feed;
import api.horse.task.Groom;
import api.horse.task.Mash;
import api.horse.task.Play;
import api.horse.task.Sleep;
import api.horse.task.Stroke;

/**
 * Take good care of your horses :)
 */
public class Tasks {

	// Pferdeäpfel Mission Flasche_geben Apfel Verwandlung Ultraschall Training
	
	public Tasks() {
		feed = new Feed();
		drink = new Drink();
		stroke = new Stroke();
		groom = new Groom();
		carrot = new Carrot();
		mash = new Mash();
		play = new Play();
		sleep = new Sleep();
		age = new Age();
	}
	
	/**
	 * Feed
	 */
	public Feed feed;
	
	/**
	 * Drink
	 */
	public Drink drink;
	
	/**
	 * Stroke
	 */
	public Stroke stroke;
	
	/**
	 * Groom
	 */
	public Groom groom;
	
	/**
	 * Carrot
	 */
	public Carrot carrot;
	
	/**
	 * Mash
	 */
	public Mash mash;
	
	/**
	 * Play
	 */
	public Play play;
	
	/**
	 * Sleep
	 */
	public Sleep sleep;
	
	/**
	 * Age
	 */
	public Age age;
	
}
