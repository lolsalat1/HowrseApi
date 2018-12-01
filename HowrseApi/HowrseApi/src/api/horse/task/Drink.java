package api.horse.task;

import api.API;
import api.ApiException;
import api.horse.Horse;
import api.request.requests.DefaultResponse;
import api.request.requests.tasks.DefaultTaskRequest;

public class Drink extends Task {

	@Override
	public int getTime() {
		return 15;
	}
	
	public DefaultResponse performTask(Horse horse, API api) throws ApiException{
		return DefaultTaskRequest.doRequest("elevage/chevaux/doDrink", "drink", horse.id, api);
	}
	
}
