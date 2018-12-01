package api.horse.task;

import api.horse.Horse;

public class Task {

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
	
}
