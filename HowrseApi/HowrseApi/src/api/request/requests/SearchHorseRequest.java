package api.request.requests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import api.API;
import api.ApiException;
import api.horse.Horse;
import api.request.RequestHandler;

/**
 * That's a big one...
 */
public class SearchHorseRequest {

	public static SearchHorseResponse sendRequest(SORT sort, FILTER filter, API api) throws ApiException {
		try {
			
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			parameters.add(new BasicNameValuePair("go", "1"));
			parameters.add(new BasicNameValuePair("filter", (filter == FILTER.specialisation_classique ? "specialisation-classique" : (filter == FILTER.specialisation_western ? "specialisation-western" : filter.name()))));
			parameters.add(new BasicNameValuePair("sort", (sort == SORT.nonne ? "" : sort.name())));
			String response = RequestHandler.read(api.requests.ApiRequest("elevage/chevaux/searchHorse", parameters, api));
			
			String[] split = response.split("href=\"/elevage/chevaux/cheval");
			
			SearchHorseResponse res = new SearchHorseResponse();
			
			HashMap<Integer, Horse> horses = new HashMap<Integer, Horse>(split.length-1);
			
			for(int i = 1; i < split.length; i++) {
				String split2 = split[i].split("=")[1].split("<")[0]; // I might find a more efficient way
				int id = Integer.parseInt(split2.split("\"")[0]);
				horses.put(id, new Horse(split2.split(">")[1], id));
				
			}
			res.horses = horses;
			res.sucess = !horses.isEmpty();
			
			return res;
			
		} catch(Exception e) {
			throw new ApiException(e, "SearchHorse Request failed");
		}
	}
	
	public static SearchHorseResponse sendRequestSimple(SORT sort, FILTER filter, API api) throws ApiException{
		try {
			
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			parameters.add(new BasicNameValuePair("go", "1"));
			parameters.add(new BasicNameValuePair("filter", (filter == FILTER.specialisation_classique ? "specialisation-classique" : (filter == FILTER.specialisation_western ? "specialisation-western" : filter.name()))));
			parameters.add(new BasicNameValuePair("sort", (sort == SORT.nonne ? "" : sort.name())));
			String response = RequestHandler.read(api.requests.ApiRequest("elevage/chevaux/searchHorse", parameters, api));
			
			String[] split = response.split("href=\"/elevage/chevaux/cheval");
			
			SearchHorseResponse res = new SearchHorseResponse();
			
			HashMap<Integer, Horse> horses = new HashMap<Integer, Horse>(split.length-1);
			
			for(int i = 1; i < split.length; i++) {
				String split2 = split[i].split("=")[1].split("<")[0]; // I might find a more efficient way
				int id = Integer.parseInt(split2.split("\"")[0]);
				horses.put(id, new Horse(split2.split(">")[1], id));
				
			}
			res.horses = horses;
			res.sucess = !horses.isEmpty();
			
			return res;
			
		} catch(Exception e) {
			throw new ApiException(e, "SearchHorse Request failed");
		}
	}
	
	public static SearchHorseResponse sendRequestVerySimple(API api) throws ApiException{
		try {
			
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			parameters.add(new BasicNameValuePair("go", "1"));
			String response = RequestHandler.read(api.requests.ApiRequest("elevage/chevaux/searchHorse", parameters, api));
			
			String[] split = response.split("href=\"/elevage/chevaux/cheval");
			
			SearchHorseResponse res = new SearchHorseResponse();
			
			HashMap<Integer, Horse> horses = new HashMap<Integer, Horse>(split.length-1);
			
			
			
			for(int i = 1; i < split.length; i++) {
				String split2 = split[i].split("=")[1].split("<")[0]; // I might find a more efficient way
				int id = Integer.parseInt(split2.split("\"")[0]);
				String name = "behindart";
				try {
					name = split2.split(">")[1];
				} catch(Exception e) {
					
				}
				horses.put(id, new Horse(name, id));
				
			}
			res.horses = horses;
			res.sucess = !horses.isEmpty();
			
			return res;
			
		} catch(Exception e) {
			throw new ApiException(e, "SearchHorse Request failed");
		}
	}
	
	public static enum SORT {
		nonne, //
		age,
		race,
		nom,
		naissance
	}
	
	public static enum FILTER {
		all,
		work,
		nowork,
		specialisation_classique, //
		specialisation_western, //
		center,
		nocenter,
		sleep,
		nosleep,
		gestation,
		nogestation,
		male,
		female
	}
	
	public static class Comparator {
		public String name;
		public int value;
		public COMPARE compare;
	}
	
	public static enum COMPARE {
		g,
		l
	}
	
	public static class SearchHorseResponse {
		public boolean sucess;
		public HashMap<Integer, Horse> horses;
	}
	
}
