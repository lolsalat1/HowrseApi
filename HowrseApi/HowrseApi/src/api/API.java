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
	
}
