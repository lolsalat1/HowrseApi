package api.request.requests.tasks;

import java.util.ArrayList;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import api.API;
import api.ApiException;
import api.request.requests.DefaultResponse;

public class DoSuckleRequest {

	public static DefaultResponse doRequest(int horseId, API api) throws ApiException {
		String response = api.requests.ApiGetString("elevage/chevaux/cheval?id=" + horseId, api);
		String[] split = response.split("id=\"form-do-suckle");

		
		ArrayList<NameValuePair> parameters = new ArrayList<NameValuePair>();
		
		parameters.add(new BasicNameValuePair(split[2].split("\"")[0], api.sessionprod));
		parameters.add(new BasicNameValuePair(split[3].split("\"")[0], "" + horseId));
		
		return api.requests.ApiDefaultRequest("elevage/chevaux/doSuckle", parameters, api);
	}
	
}
