package api;

import api.request.RequestHandler;
import api.request.requests.DefaultResponse;
import api.request.requests.LoginRequest;

/**
 * Top level implementation of request handling and stuff like that
 */
public class API {

	public API(SERVER_COUNTRY locale) {
		this.locale = locale;
		requests = new RequestHandler(this);
	}
	
	/**
	 * Sessionprod (some kind of session token)
	 */
	public String sessionprod;
	
	/**
	 * Useragent
	 */
	public String useragent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:63.0) Gecko/20100101 Firefox/63.0";
	
	/**
	 * Requesthandler
	 */
	public RequestHandler requests;
	
	/**
	 * Logs you in
	 */
	public DefaultResponse doLogin(String username, String password) throws ApiException{
		generateSessionprod();
		String parameter_name = LoginRequest.getParameterName(this);
		return LoginRequest.fireRequest(username, password, parameter_name, this);
	}
	
	/**
	 * Sometimes your sessionprod changes, so updating it might be a good idea
	 */
	public void updateSessionProd(String sp) {
		if(!sp.equals("deleted"))
			sessionprod = sp;
	}
	
	/**
	 * Generates a sessionprod 4 you
	 */
	public void generateSessionprod() throws ApiException{
		requests.ApiGetRequest(requests.apiUrl, this);
	}
	
	/**
	 * Not everyone plays on the same Server
	 */
	public SERVER_COUNTRY locale;
	
	/**
	 * Server you play on
	 */
	public static enum SERVER_COUNTRY {
		WORLDWIDE,
		US, // USA
		GB, // Great Britain 
		AU,	// Australia
		CA, // Canada
		DE, // Germany
		FR, // France
		ES, // Spain
		PT, // Portugal
		BR, // Brazil
		IL, // Israel
		RU, // Russia ma fränd
		IT, // Italy
		NL, // Netherlands
		SE, // Sweeden
		PL, // Poland
		CZ, // Check Republic
		DK, // Denmark
		FI, // Finnland
		NO, // Norway
		AR, // Arabia
		HU, // Hungary
		RO, // Romania
		BG, // Belgium
		SI, // Slovenia
		SK  // Slovakia
		
	}
}
