package api;

import java.util.HashMap;

import api.horse.Horse;
import api.request.requests.SearchHorseRequest;
import api.request.requests.SearchHorseRequest.FILTER;
import api.request.requests.SearchHorseRequest.SORT;
import api.request.requests.SearchHorseRequest.SearchHorseResponse;

/**
 * As far as I know, you can manage your horses using breeds
 */
public class Breed {

	/**
	 * name and id should be enough
	 */
	public Breed(String name, int id) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * Id
	 */
	public int id;
	
	/**
	 * Name
	 */
	public String name;
	
	/**
	 * Horses
	 */
	public HashMap<Integer, Horse> horses;

	
	/**
	 * returns true if this is the default breed (no breed)
	 * DON'T MESS AROUND AND NAME ONE OF YOUR BREEDS "default" I CANNOT HELP YOU !
	 */
	public boolean isDefault() {
		return name.equals("default");
	}

	public void updateHorses(API api) throws ApiException{
		try {
			if(name.equals("default")) {
				SearchHorseResponse res = SearchHorseRequest.sendRequestSimple(SORT.nonne, FILTER.all, api);
				horses = res.horses;
			} else {
				
				SearchHorseResponse res1 = SearchHorseRequest.seachBreed(id, 0, api);
				if(horses != null)
					horses.clear();
				horses = res1.horses;
				int pages = res1.pages;
				for(int i = 1; i < pages; i++) {
					SearchHorseResponse res = SearchHorseRequest.seachBreed(id, i, api);
					horses.putAll(res.horses);
				}
			}
		} catch(Exception e) {
			throw new ApiException(e, "Couldn't update horses");
		}
	}

	@Override
	public String toString() {
		return "Breed [id=" + id + ", name=" + name + "]";
	}
	
}
