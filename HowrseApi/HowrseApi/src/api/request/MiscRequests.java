package api.request;

import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import api.API;
import api.ApiException;
import api.request.requests.DefaultResponse;

public class MiscRequests {

	public static DefaultResponse openCase(int id, API api) throws ApiException {
		ArrayList<NameValuePair> parameters = new ArrayList<NameValuePair>();
		parameters.add(new BasicNameValuePair("case", ""+id));
		return api.requests.ApiDefaultRequest("operation/calendrier/doOpenCase", parameters, api);
	}
	
	public static DefaultResponse logout(API api) throws ApiException {
		ArrayList<NameValuePair> parameters = new ArrayList<NameValuePair>();
		parameters.add(new BasicNameValuePair("sid", api.sessionprod));
		return api.requests.ApiDefaultRequest("site/doLogOut", parameters, api);
	}
	
}
