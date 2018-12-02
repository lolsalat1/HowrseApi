package api.horse.task;

import api.API;
import api.ApiException;
import api.horse.Horse;
import api.request.requests.DefaultResponse;
import api.request.requests.tasks.DoFeedRequest;

public class Feed extends Task{

	public int maxHey;
	public int suggestedHey;
	
	public int maxOats;
	public int suggestedOats;
	public boolean hasOats;
	
	public boolean isSuggested() {
		return suggestedOats > 0 || suggestedHey > 0;
	}
	
	public DefaultResponse performTask(Horse h, API api) throws ApiException {
		if(hasOats) {
			return DoFeedRequest.doRequest(suggestedHey, suggestedOats, h.id, api);
		} else {
			return DoFeedRequest.doRequestSimple(suggestedHey, h.id, api);
		}
	}
	
}
