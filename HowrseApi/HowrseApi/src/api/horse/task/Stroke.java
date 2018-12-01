package api.horse.task;

import api.API;
import api.ApiException;
import api.horse.Horse;
import api.request.requests.DefaultResponse;
import api.request.requests.tasks.DoStrokeRequest;

public class Stroke extends Task {

	@Override
	public int getTime() {
		return 30;
	}
	
	public DefaultResponse performTask(Horse horse, API api) throws ApiException{
		return DoStrokeRequest.fireRequest(horse.id, api);
	}
	
}
