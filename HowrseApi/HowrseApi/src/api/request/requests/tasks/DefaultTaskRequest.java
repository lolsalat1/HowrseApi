package api.request.requests.tasks;

import java.util.ArrayList;
import java.util.Random;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import api.API;
import api.ApiException;
import api.request.requests.DefaultResponse;

public class DefaultTaskRequest {

	public static DefaultResponse doRequest(String command, String filter, int horseId, API api) throws ApiException {
		String response = api.requests.ApiGetString("elevage/chevaux/cheval?id=" + horseId, api);
		String[] split = response.split("id=\"form-do-" + filter);

		
		ArrayList<NameValuePair> parameters = new ArrayList<NameValuePair>();
		
		parameters.add(new BasicNameValuePair(split[2].split("\"")[0].toLowerCase(), api.sessionprod));
		parameters.add(new BasicNameValuePair(split[3].split("\"")[0].toLowerCase(), "" + horseId));
		parameters.add(new BasicNameValuePair(split[4].split("\"")[0].toLowerCase(), "" + new Random().nextInt(80)));
		parameters.add(new BasicNameValuePair(split[5].split("\"")[0].toLowerCase(), "" + new Random().nextInt(80)));
		
		return api.requests.ApiDefaultRequest(command, parameters, api);
	}
	
	
	
}
