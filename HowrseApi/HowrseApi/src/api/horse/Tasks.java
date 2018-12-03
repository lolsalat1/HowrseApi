package api.horse;

import java.util.HashSet;

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
import api.horse.task.Task;
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
	
	private HashSet<Task> available = new HashSet<Task>();
	
	public HashSet<Task> getAvailable(Horse h){
		available.clear();
		if(feed.isAvailable(h))
			available.add(feed);
		if(drink.isAvailable(h))
			available.add(drink);
		if(stroke.isAvailable(h))
			available.add(stroke);
		if(groom.isAvailable(h))
			available.add(groom);
		if(carrot.isAvailable(h))
			available.add(carrot);
		if(mash.isAvailable(h))
			available.add(mash);
		if(play.isAvailable(h))
			available.add(play);
		if(sleep.isAvailable(h))
			available.add(sleep);
		if(age.isAvailable(h))
			available.add(age);
		if(suckle.isAvailable(h))
			available.add(suckle);
		if(centreMission.isAvailable(h))
			available.add(centreMission);
		return available;
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
