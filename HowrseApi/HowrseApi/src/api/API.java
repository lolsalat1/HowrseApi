package api;

import api.request.RequestHandler;

/**
 * Top level implementation of request handling and stuff like that
 */
public class API {

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
	 * Sometimes your sessionprod changes, so updating it might be a good idea
	 */
	public void updateSessionProd(String sp) {
		if(!sp.equals("deleted"))
			sessionprod = sp;
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
