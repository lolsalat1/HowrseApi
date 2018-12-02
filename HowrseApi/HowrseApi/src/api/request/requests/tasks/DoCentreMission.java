package api.request.requests.tasks;

import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import api.API;
import api.ApiException;
import api.request.requests.DefaultResponse;

public class DoCentreMission {

	public static DefaultResponse doRequest(int horseId, API api) throws ApiException { // TODO parse more from the response (as there is alot)
		ArrayList<NameValuePair> parameters = new ArrayList<NameValuePair>();
		parameters.add(new BasicNameValuePair("id","" + horseId));
		return api.requests.ApiDefaultRequest("elevage/chevaux/doCentreMission", parameters, api);
	}
	
}
