package api.request.requests;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import api.API;
import api.ApiException;

/**
 * A response that consists of "errorsText", "messageText", "errors", "message" and "redirection"
 */
public class DefaultResponse {

	public DefaultResponse(JsonObject json, API api) throws ApiException{
		try {
			if(json.has("errorsText"))
				errorsText = json.get("errorsText").getAsString();
			if(json.has("messageText"))
				messageText = json.get("messageText").getAsString();
			if(json.has("errors")) {
				errors = json.get("errors").getAsJsonArray();
				sucess = errors.size() == 0;
			}
			if(json.has("message"))
				message = json.get("message");
			if(json.has("redirection"))
				redirection = json.get("redirection").getAsString();
			if(json.has("externalRedirection")) 
				if(json.get("externalRedirection").getAsInt() == 1) 
					redirection = api.requests.apiUrl + redirection;
		} catch(Exception e) {
			throw new ApiException(e, "Error parsing response");
		}
	}
	
	/**
	 * Errors Text
	 */
	public String errorsText;

	/**
	 * message Text
	 */
	public String messageText;
	
	/**
	 * errors
	 */
	public JsonArray errors;
	
	/**
	 * message
	 */
	public JsonElement message;
	
	/**
	 * Redirection
	 */
	public String redirection;
	
	/**
	 * Sucess
	 */
	public boolean sucess;
}
