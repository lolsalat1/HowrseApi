package api.horse.task;

import api.API;
import api.ApiException;
import api.horse.Horse;
import api.request.requests.DefaultResponse;
import api.request.requests.tasks.DoMissionRequest;

public class CentreMission extends Task{

	public DefaultResponse performTask(Horse h, API api) throws ApiException {
		return DoMissionRequest.doRequest(h.id, api);
	}
	
}
