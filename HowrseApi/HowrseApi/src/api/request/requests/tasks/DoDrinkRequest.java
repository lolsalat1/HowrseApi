package api.request.requests.tasks;

import java.util.ArrayList;
import java.util.Random;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import api.API;
import api.ApiException;
import api.request.requests.DefaultResponse;

public class DoDrinkRequest {

	public static DefaultResponse fireRequest(String p1, String p2, String p3, String p4, int horseId, API api) throws ApiException {
		ArrayList<NameValuePair> parameters = new ArrayList<NameValuePair>();
		
		parameters.add(new BasicNameValuePair(p1, api.sessionprod));
		parameters.add(new BasicNameValuePair(p2, "" + horseId));
		parameters.add(new BasicNameValuePair(p3, "" + new Random().nextInt(80)));
		parameters.add(new BasicNameValuePair(p4, "" + new Random().nextInt(80)));
		
		return api.requests.ApiDefaultRequest("elevage/chevaux/doDrink", parameters, api);
	}
	
	public static DefaultResponse fireRequest(int horseId, API api) throws ApiException {
		
		String response = api.requests.ApiGetString("elevage/chevaux/cheval?id=" + horseId, api);
		String[] split = response.split("id=\"form-do-drink");
		
		return fireRequest(split[2].split("\"")[0],
							split[3].split("\"")[0],
							split[4].split("\"")[0],
							split[5].split("\"")[0],
							horseId,
							api);
	}
	
}
