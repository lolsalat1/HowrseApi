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

	public static SearchHorseResponse seachBreed(int breedId, int page, API api) throws ApiException {
		try {
			
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			parameters.add(new BasicNameValuePair("5th-element", "2"));
			parameters.add(new BasicNameValuePair("advanced", "0"));
			parameters.add(new BasicNameValuePair("age", "0"));
			parameters.add(new BasicNameValuePair("ageComparaison", "g"));
			parameters.add(new BasicNameValuePair("aneRaceId", "57"));
			parameters.add(new BasicNameValuePair("bande", ""));
			parameters.add(new BasicNameValuePair("blup", "-100"));
			parameters.add(new BasicNameValuePair("blupComparaison","g"));
			parameters.add(new BasicNameValuePair("bonnet", ""));
			parameters.add(new BasicNameValuePair("bras-morphee", "2"));
			parameters.add(new BasicNameValuePair("bride", ""));
			parameters.add(new BasicNameValuePair("caresse-philotes", "2"));
			parameters.add(new BasicNameValuePair("catrina-brooch", "2"));
			parameters.add(new BasicNameValuePair("centreEquestre", "2"));
			parameters.add(new BasicNameValuePair("chapeau-magique", "2"));
			parameters.add(new BasicNameValuePair("chevalNom", ""));
			parameters.add(new BasicNameValuePair("chevalType", ""));
			parameters.add(new BasicNameValuePair("chevalTypeRace", ""));
			parameters.add(new BasicNameValuePair("citrouille-ensorcelee", "2"));
			parameters.add(new BasicNameValuePair("classique", "2"));
			parameters.add(new BasicNameValuePair("competences", "0"));
			parameters.add(new BasicNameValuePair("competencesComparaison", "g"));
			parameters.add(new BasicNameValuePair("couche", "2"));
			parameters.add(new BasicNameValuePair("diamond-apple", "2"));
			parameters.add(new BasicNameValuePair("don-hestia", "2"));
			parameters.add(new BasicNameValuePair("double-face", "2"));
			parameters.add(new BasicNameValuePair("dressage", "0"));
			parameters.add(new BasicNameValuePair("dressageComparaison", "g"));
			parameters.add(new BasicNameValuePair("endurance", "0"));
			parameters.add(new BasicNameValuePair("enduranceComparaison", "g"));
			parameters.add(new BasicNameValuePair("esprit-nomade", "2"));
			parameters.add(new BasicNameValuePair("excellence", "0"));
			parameters.add(new BasicNameValuePair("excellenceComparaison", "g"));
			parameters.add(new BasicNameValuePair("filter", "all"));
			parameters.add(new BasicNameValuePair("fragment", "2"));
			parameters.add(new BasicNameValuePair("galop", "0"));
			parameters.add(new BasicNameValuePair("galopComparaison", "g"));
			parameters.add(new BasicNameValuePair("genetique", "0"));
			parameters.add(new BasicNameValuePair("genetiqueComparaison", "g"));
			parameters.add(new BasicNameValuePair("gestation", "2"));
			parameters.add(new BasicNameValuePair("go", "1"));
			parameters.add(new BasicNameValuePair("id", "" + breedId));
			parameters.add(new BasicNameValuePair("jouvence", "2"));
			parameters.add(new BasicNameValuePair("livre-monstres", "2"));
			parameters.add(new BasicNameValuePair("lyre-apollon", "2"));
			parameters.add(new BasicNameValuePair("nbSaillie", "0"));
			parameters.add(new BasicNameValuePair("nbSaillieComparaison", "g"));
			parameters.add(new BasicNameValuePair("noFilter", "1"));
			parameters.add(new BasicNameValuePair("pack-nyx", "2"));
			parameters.add(new BasicNameValuePair("pack-poseidon", "2"));
			parameters.add(new BasicNameValuePair("pierre-philosophale", "2"));
			parameters.add(new BasicNameValuePair("pomme-vintage", "2"));
			parameters.add(new BasicNameValuePair("pommeOr", "2"));
			parameters.add(new BasicNameValuePair("pommeOrDisparue", "2"));
			parameters.add(new BasicNameValuePair("purete", "2"));
			parameters.add(new BasicNameValuePair("r41", ""));
			parameters.add(new BasicNameValuePair("r42", ""));
			parameters.add(new BasicNameValuePair("r43", ""));
			parameters.add(new BasicNameValuePair("r44", ""));
			parameters.add(new BasicNameValuePair("r45", ""));
			parameters.add(new BasicNameValuePair("r46", ""));
			parameters.add(new BasicNameValuePair("r47", ""));
			parameters.add(new BasicNameValuePair("r48", ""));
			parameters.add(new BasicNameValuePair("r49", ""));
			parameters.add(new BasicNameValuePair("r50", ""));
			parameters.add(new BasicNameValuePair("r51", ""));
			parameters.add(new BasicNameValuePair("r52", ""));
			parameters.add(new BasicNameValuePair("r53", ""));
			parameters.add(new BasicNameValuePair("r54", ""));
			parameters.add(new BasicNameValuePair("r55", ""));
			parameters.add(new BasicNameValuePair("r56", ""));
			parameters.add(new BasicNameValuePair("r57", ""));
			parameters.add(new BasicNameValuePair("r58", ""));
			parameters.add(new BasicNameValuePair("r59", ""));
			parameters.add(new BasicNameValuePair("r60", ""));
			parameters.add(new BasicNameValuePair("r61", ""));
			parameters.add(new BasicNameValuePair("r62", ""));
			parameters.add(new BasicNameValuePair("r63", ""));
			parameters.add(new BasicNameValuePair("r64", ""));
			parameters.add(new BasicNameValuePair("r65", ""));
			parameters.add(new BasicNameValuePair("r66", ""));
			parameters.add(new BasicNameValuePair("r67", ""));
			parameters.add(new BasicNameValuePair("r68", ""));
			parameters.add(new BasicNameValuePair("r69", ""));
			parameters.add(new BasicNameValuePair("r70", ""));
			parameters.add(new BasicNameValuePair("r71", ""));
			parameters.add(new BasicNameValuePair("r72", ""));
			parameters.add(new BasicNameValuePair("r73", ""));
			parameters.add(new BasicNameValuePair("r74", ""));
			parameters.add(new BasicNameValuePair("r75", ""));
			parameters.add(new BasicNameValuePair("r76", ""));
			parameters.add(new BasicNameValuePair("r77", ""));
			parameters.add(new BasicNameValuePair("r78", ""));
			parameters.add(new BasicNameValuePair("r79", ""));
			parameters.add(new BasicNameValuePair("r80", ""));
			parameters.add(new BasicNameValuePair("r81", ""));
			parameters.add(new BasicNameValuePair("r82", ""));
			parameters.add(new BasicNameValuePair("r83", ""));
			parameters.add(new BasicNameValuePair("r84", ""));
			parameters.add(new BasicNameValuePair("r85", ""));
			parameters.add(new BasicNameValuePair("r86", ""));
			parameters.add(new BasicNameValuePair("r87", ""));
			parameters.add(new BasicNameValuePair("r90", ""));
			parameters.add(new BasicNameValuePair("r91", ""));
			parameters.add(new BasicNameValuePair("r92", ""));
			parameters.add(new BasicNameValuePair("r93", ""));
			parameters.add(new BasicNameValuePair("race-all", ""));
			parameters.add(new BasicNameValuePair("race-ane", "57"));
			parameters.add(new BasicNameValuePair("race-cheval", ""));	
			parameters.add(new BasicNameValuePair("race-cheval-trait", ""));
			parameters.add(new BasicNameValuePair("race-cheval-trait-aile", ""));
			parameters.add(new BasicNameValuePair("race-licorne", ""));
			parameters.add(new BasicNameValuePair("race-licorne-ailee", ""));
			parameters.add(new BasicNameValuePair("race-pegase", ""));
			parameters.add(new BasicNameValuePair("race-poney", ""));
			parameters.add(new BasicNameValuePair("rall", ""));
			parameters.add(new BasicNameValuePair("rayonHelios", "2"));
			parameters.add(new BasicNameValuePair("sablier-chronos", "2"));
			parameters.add(new BasicNameValuePair("saut", "0"));
			parameters.add(new BasicNameValuePair("sautComparaison", "g"));
			parameters.add(new BasicNameValuePair("sceau-apocalypse", "2"));
			parameters.add(new BasicNameValuePair("search", "0"));
			parameters.add(new BasicNameValuePair("selle", ""));
			parameters.add(new BasicNameValuePair("sexe", ""));
			parameters.add(new BasicNameValuePair("sort	age", ""));
			parameters.add(new BasicNameValuePair("startingPage", "" + page));
			parameters.add(new BasicNameValuePair("tapis", ""));	
			parameters.add(new BasicNameValuePair("travaille", "2"));
			parameters.add(new BasicNameValuePair("trot" ,"0"));
			parameters.add(new BasicNameValuePair("trotComparaison", "g"));
			parameters.add(new BasicNameValuePair("uniteAge", "ans"));
			parameters.add(new BasicNameValuePair("vente", "2"));
			parameters.add(new BasicNameValuePair("vitesse", "0"));
			parameters.add(new BasicNameValuePair("vitesseComparaison", "g"));
			parameters.add(new BasicNameValuePair("western", "2"));
			
			String response = RequestHandler.read(api.requests.ApiRequest("elevage/chevaux/searchHorse", parameters, api));
			
			String[] split = response.split("href=\"/elevage/chevaux/cheval");
			
			SearchHorseResponse res = new SearchHorseResponse();
			res.pages = response.split("data-page=").length / 2;
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
	
	public static SearchHorseResponse sendRequestSimple(SORT sort, FILTER filter, API api) throws ApiException{
		try {
			
			List<NameValuePair> parameters = new ArrayList<NameValuePair>();
			parameters.add(new BasicNameValuePair("go", "1"));
			parameters.add(new BasicNameValuePair("filter", (filter == FILTER.specialisation_classique ? "specialisation-classique" : (filter == FILTER.specialisation_western ? "specialisation-western" : filter.name()))));
			parameters.add(new BasicNameValuePair("sort", (sort == SORT.nonne ? "" : sort.name())));
			String response = RequestHandler.read(api.requests.ApiRequest("elevage/chevaux/searchHorse", parameters, api));
			
			String[] split = response.split("href=\"/elevage/chevaux/cheval");
			
			SearchHorseResponse res = new SearchHorseResponse();
			res.pages = response.split("data-page=").length / 2;
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
			res.pages = response.split("data-page=").length / 2;
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
	
	public static class SearchHorseResponse {
		public boolean sucess;
		public HashMap<Integer, Horse> horses;
		public int pages;
	}
	
}
