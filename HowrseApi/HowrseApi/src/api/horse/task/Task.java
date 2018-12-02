package api.horse.task;

import api.API;
import api.ApiException;
import api.horse.Horse;
import api.request.requests.DefaultResponse;

public abstract class Task {

	/**
	 * Can your horse perform this task?
	 */
	public boolean available;
	
	public int getTime() {
		return -1;
	}
	
	public boolean isAvailable(Horse h) {
		return available;
	}
	
	public abstract DefaultResponse performTask(Horse horse, API api) throws ApiException;
	
}
