package api.horse.task;

import api.API;
import api.ApiException;
import api.horse.Horse;
import api.request.requests.DefaultResponse;
import api.request.requests.tasks.DoAgeRequest;

public class Age extends Task {

	@Override
	public DefaultResponse performTask(Horse horse, API api) throws ApiException {
		return DoAgeRequest.doRequest(horse.id, horse.characteristics.age.asMonths(), api);
	}

	
	
}
