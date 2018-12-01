package api.horse.task;

import api.API;
import api.ApiException;
import api.horse.Horse;
import api.request.requests.DefaultResponse;
import api.request.requests.tasks.DefaultTaskRequest;

public class Sleep extends Task{

	public DefaultResponse performTask(Horse horse, API api) throws ApiException{
		return DefaultTaskRequest.doRequest("elevage/chevaux/doNight", "night", horse.id, api);
	}
	
}
