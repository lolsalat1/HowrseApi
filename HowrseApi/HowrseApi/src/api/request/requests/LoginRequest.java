package api.request.requests;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import api.API;
import api.ApiException;
import api.request.RequestHandler;

public class LoginRequest {

	public static String REQUEST_URL = "site/doLogIn";
	
	/**
	 * fires a Login request.
	 * make sure to get the sessionprod first!
	 * @param username Username
	 * @param password Password
	 * @param parameter_name Name of the parameter containing the sessionprod (if you don't know, just a 5 letter random String of charset "abcdef123456"
	 * @param api Api
	 * @return DefaultResponse
	 * @throws ApiException
	 */
	public static DefaultResponse fireRequest(String username, String password, String parameter_name, API api) throws ApiException{
		List<NameValuePair> parameters = new ArrayList<NameValuePair>();
		
		parameters.add(new BasicNameValuePair(parameter_name, api.sessionprod));
		parameters.add(new BasicNameValuePair("isBoxStyle", ""));
		parameters.add(new BasicNameValuePair("login", username));
		parameters.add(new BasicNameValuePair("password", password));
		parameters.add(new BasicNameValuePair("redirection", api.requests.apiUrl));
		
		return api.requests.ApiDefaultRequest(REQUEST_URL, parameters, api);
	}
	
	public static String getParameterName(API api) throws ApiException {
		try {
			String response = RequestHandler.read(api.requests.ApiGetRequest("", api));
			return response.split("id=\"authentification")[2].split("\"")[0];
		} catch (Exception e) {
			throw new ApiException(e, "Couldn't get Parametername");
		}
	}
	
}
