package api.horse.task;

import api.API;
import api.ApiException;
import api.horse.Horse;
import api.request.requests.DefaultResponse;

public class Age extends Task {

	@Override
	public DefaultResponse performTask(Horse horse, API api) throws ApiException {
		throw new ApiException("NOT IMPLEMENTED");
	}

	
	
}
