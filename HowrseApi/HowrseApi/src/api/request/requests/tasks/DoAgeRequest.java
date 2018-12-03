package api.request.requests.tasks;

import java.util.ArrayList;
import java.util.Random;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import api.API;
import api.ApiException;
import api.request.requests.DefaultResponse;

public class DoAgeRequest {

	public static DefaultResponse doRequest(int horseId, int months, API api) throws ApiException {
		String response = api.requests.ApiGetString("elevage/chevaux/cheval?id=" + horseId, api);
		String[] split = response.split("/doAge")[1].split("age");

		
		ArrayList<NameValuePair> parameters = new ArrayList<NameValuePair>();
		
		parameters.add(new BasicNameValuePair(split[1].split("\"")[0].toLowerCase(), api.sessionprod));
		parameters.add(new BasicNameValuePair(split[2].split("\"")[0].toLowerCase(), "" + horseId));
		parameters.add(new BasicNameValuePair(split[4].split("\"")[0].toLowerCase(), "" + months));
		parameters.add(new BasicNameValuePair(split[6].split("\"")[0].toLowerCase(), "" + new Random().nextInt(80)));
		parameters.add(new BasicNameValuePair(split[8].split("\"")[0].toLowerCase(), "" + new Random().nextInt(80)));
		
		return api.requests.ApiDefaultRequest("elevage/chevaux/doAge", parameters, api);
	}
	
	
	
}
