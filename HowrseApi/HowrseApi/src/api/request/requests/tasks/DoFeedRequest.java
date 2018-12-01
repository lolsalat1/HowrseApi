package api.request.requests.tasks;

import java.util.ArrayList;
import java.util.Random;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import api.API;
import api.ApiException;
import api.request.requests.DefaultResponse;

public class DoFeedRequest {

	public static DefaultResponse doRequestSimple(int hey, int horseId, API api) throws ApiException {
		String response = api.requests.ApiGetString("elevage/chevaux/cheval?id=" + horseId, api);
		String[] split = response.split("id=\"feeding");

		
		ArrayList<NameValuePair> parameters = new ArrayList<NameValuePair>();
		
		parameters.add(new BasicNameValuePair(split[2].split("\"")[0].toLowerCase(), api.sessionprod));
		parameters.add(new BasicNameValuePair(split[3].split("\"")[0].toLowerCase(), "" + horseId));
		parameters.add(new BasicNameValuePair(split[4].split("\"")[0].toLowerCase(), "" + new Random().nextInt(80)));
		parameters.add(new BasicNameValuePair(split[5].split("\"")[0].toLowerCase(), "" + new Random().nextInt(80)));
		
		split = response.split("name=\"feeding");
		
		parameters.add(new BasicNameValuePair(split[4].split("\"")[0].toLowerCase(), ""+hey));
		
		return api.requests.ApiDefaultRequest("elevage/chevaux/doEat", parameters, api);
	}
	
	public static DefaultResponse doRequest(int hey, int oats, int horseId, API api) throws ApiException {
		String response = api.requests.ApiGetString("elevage/chevaux/cheval?id=" + horseId, api);
		String[] split = response.split("id=\"feeding");

		
		ArrayList<NameValuePair> parameters = new ArrayList<NameValuePair>();
		
		parameters.add(new BasicNameValuePair(split[2].split("\"")[0].toLowerCase(), api.sessionprod));
		parameters.add(new BasicNameValuePair(split[3].split("\"")[0].toLowerCase(), "" + horseId));
		parameters.add(new BasicNameValuePair(split[4].split("\"")[0].toLowerCase(), "" + new Random().nextInt(80)));
		parameters.add(new BasicNameValuePair(split[5].split("\"")[0].toLowerCase(), "" + new Random().nextInt(80)));
		
		split = response.split("name=\"feeding");
		
		parameters.add(new BasicNameValuePair(split[4].split("\"")[0].toLowerCase(), ""+hey));
		parameters.add(new BasicNameValuePair(split[5].split("\"")[0].toLowerCase(), ""+oats));
		
		
		return api.requests.ApiDefaultRequest("elevage/chevaux/doEat", parameters, api);
	}
	
	
}
