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

	public DefaultResponse logout() throws ApiException{
		return MiscRequests.logout(api);
	}
	
}
