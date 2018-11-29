package api.request.requests;

import java.util.HashMap;

import api.API;
import api.ApiException;
import api.Breed;

/**
 * Ouch html ...
 */
public class GetBreedsRequest {

	public static GetBreedsResponse fireRequest(API api) throws ApiException{
		
		GetBreedsResponse response = new GetBreedsResponse();
		
		response.breeds = new HashMap<Integer, Breed>();
		
		String res = api.requests.ApiGetString("elevage/chevaux/?elevage=all-horses", api);
		String[] split = res.split("select-tab-");
		
		// If not just default
		if(split.length > 1) {
			for(int i = 1; i < split.length - 1; i++) {
				int id = Integer.parseInt(split[i].split("\"")[0]);
				String name = split[i].split("alt=\"")[1].split("\"")[0];
				response.breeds.put(id, new Breed(name, id));
			}
		}
		
		// default breed
		Breed defaultBreed = new Breed("default", 0);
		defaultBreed.horses = SearchHorseRequest.sendRequestVerySimple(api).horses;
		response.breeds.put(0, defaultBreed);
		
		response.sucess = !response.breeds.isEmpty();
		
		return response;
	}
	
	public static class GetBreedsResponse {
		public boolean sucess;
		public HashMap<Integer, Breed> breeds;
	}
	
}
