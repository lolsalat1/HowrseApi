package api;

import java.util.HashMap;

import api.request.MiscRequests;
import api.request.requests.DefaultResponse;

/**
 * Everything you need should be in here
 */
public class Account {

	/**
	 * Breeds
	 */
	public HashMap<Integer, Breed> breeds;
	
	/**
	 * Api
	 */
	public API api;
	
	/**
	 * Equus
	 */
	public int equus;
	
	/**
	 * Pass
	 */
	public int pass;

	/**
	 * Logged in
	 */
	public boolean loggedIn;
	
	public boolean logIn(String username, String password) {
		try {
			loggedIn = api.doLogin(username, password).sucess;
			return loggedIn;
		} catch(ApiException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public DefaultResponse logout() throws ApiException{
		return MiscRequests.logout(api);
	}
	
}
