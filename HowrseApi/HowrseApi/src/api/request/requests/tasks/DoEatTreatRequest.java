package api.request.requests.tasks;

import java.util.ArrayList;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import api.API;
import api.ApiException;
import api.request.requests.DefaultResponse;

public class DoEatTreatRequest {

	public static DefaultResponse fireRequest(String type, int horseId, API api) throws ApiException {
		String response = api.requests.ApiGetString("elevage/chevaux/cheval?id=" + horseId, api);
		String[] split = response.split("id=\"form-do-eat-treat-carotte");

		
		ArrayList<NameValuePair> parameters = new ArrayList<NameValuePair>();
		
		parameters.add(new BasicNameValuePair(split[2].split("\"")[0], api.sessionprod));
		parameters.add(new BasicNameValuePair("friandise", type));
		parameters.add(new BasicNameValuePair("id", ""+horseId));
		
		return api.requests.ApiDefaultRequest("elevage/chevaux/doEatTreat", parameters, api);
	}
	
}
