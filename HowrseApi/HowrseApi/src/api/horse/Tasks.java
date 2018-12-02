package api.horse;

import api.API;
import api.ApiException;
import api.horse.task.Age;
import api.horse.task.Carrot;
import api.horse.task.CentreMission;
import api.horse.task.Drink;
import api.horse.task.Feed;
import api.horse.task.Groom;
import api.horse.task.Mash;
import api.horse.task.Play;
import api.horse.task.Sleep;
import api.horse.task.Stroke;
import api.horse.task.Suckle;
import api.request.requests.DefaultResponse;

/**
 * Take good care of your horses :)
 */
public class Tasks {

	// Pferdeäpfel Mission Apfel Verwandlung Ultraschall Training
	
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
		suckle = new Suckle();
		centreMission = new CentreMission();
	}
	
	public DefaultResponse doCarrot(Horse horse, API api) throws ApiException {
		return carrot.performTask(horse, api);
	}
	
	public DefaultResponse doGroom(Horse horse, API api) throws ApiException {
		return groom.performTask(horse, api);
	}
	
	public DefaultResponse doDrink(Horse horse, API api) throws ApiException{
		return drink.performTask(horse, api);
	}
	
	public DefaultResponse doStroke(Horse horse, API api) throws ApiException{
		return stroke.performTask(horse, api);
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
	
	/**
	 * Suckle
	 */
	public Suckle suckle;
	
	/**
	 * Centre Mission
	 */
	public CentreMission centreMission;
	
}
