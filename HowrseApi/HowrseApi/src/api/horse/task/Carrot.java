package api.horse.task;

import api.API;
import api.ApiException;
import api.horse.Horse;
import api.request.requests.DefaultResponse;
import api.request.requests.tasks.DoEatTreatRequest;

public class Carrot extends Task{

	@Override
	public int getTime() {
		return 15;
	}
	
	public DefaultResponse performTask(Horse horse, API api) throws ApiException{
		return DoEatTreatRequest.fireRequest("carotte", horse.id, api);
	}
	
}
