package api.horse;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import api.API;
import api.ApiException;
import utils.Age;

/**
 * Howrse is all about horses :)
 */
public class Horse {

	// TODO Care, Night, Rideout, Training, Competitions, Breeding, EquestrianCenter
	
	@Override
	public String toString() {
		return "Horse [name=" + name + ", id=" + id + "]";
	}


	/**
	 * Id and name is enough at first, and if you want more the id does a great job
	 */
	public Horse(String name, int id) {
		this.name = name;
		this.id = id;
		
		status = new Status();
		skills = new Skills();
		genetics = new Genetics();
		characteristics = new Characteristics();
		tasks = new Tasks();
		boni = new HashSet<Bonus>();
	}
	
	/**
	 * Name of the cutie ;)
	 */
	public String name;
	
	/**
	 * Id of the loved one
	 */
	public int id;
	
	/**
	 * Status of the horse
	 */
	public Status status;
	
	/**
	 * Skills of the horse
	 */
	public Skills skills;
	
	/**
	 * Genetics of the horse
	 */
	public Genetics genetics;
	
	/**
	 * Characteristics of the horse
	 */
	public Characteristics characteristics;
	
	/**
	 * Tasks
	 */
	public Tasks tasks;
	
	/**
	 * Boni the horse enjoys
	 */
	public Set<Bonus> boni;
	

	// Let the fun begin
	/**
	 * Updates all information about the horse
	 */
	public void updateHorse(API api) throws ApiException {
		try {
			String resp = api.requests.ApiGetString("elevage/chevaux/cheval?id=" + id, api);
			
			String[] split1 = resp.split("de la nourriture");
			
			// TY developers of horse
			HashMap<String, String> vars = new HashMap<String, String>();
			for(String s : split1[0].split("var ")) {
				String name = s.split(" ")[0];
				
				String value = null;
				try{
					value = s.split("= ")[1].split(";")[0];
				} catch(Exception e) {
					
				}
				vars.put(name, value);
			}
			
			try {
				name = vars.get("chevalNom").split("<b>")[1].split("</b>")[0];
			} catch(Exception e) {
				
			}
			
			// Status
			status.moral = Float.parseFloat(vars.get("chevalMoral"));
			status.energy = Float.parseFloat(vars.get("chevalEnergie"));
			status.health = Float.parseFloat(vars.get("chevalSante"));
			// TODO time
			
			// Skills
			skills.dressage = Float.parseFloat(vars.get("dressageValeur"));
			skills.gallop = Float.parseFloat(vars.get("galopValeur"));
			skills.jump = Float.parseFloat(vars.get("sautValeur"));
			skills.speed = Float.parseFloat(vars.get("vitesseValeur"));
			skills.stamina = Float.parseFloat(vars.get("enduranceValeur"));
			skills.trot = Float.parseFloat(vars.get("trotValeur"));
			
			// Genetics
			// TODO blob
			// TODO dad
			// TODO mom
			// TODO excellence
			genetics.potential.dressage = Float.parseFloat(vars.get("dressageGenetique"));
			genetics.potential.gallop = Float.parseFloat(vars.get("galopGenetique"));
			genetics.potential.jump = Float.parseFloat(vars.get("sautGenetique"));
			genetics.potential.speed = Float.parseFloat(vars.get("vitesseGenetique"));
			genetics.potential.stamina = Float.parseFloat(vars.get("enduranceGenetique"));
			genetics.potential.trot = Float.parseFloat(vars.get("trotGenetique"));
			// TODO race
			
			// Characteristics
			characteristics.age = new Age(Integer.parseInt(vars.get("chevalAge")));
			// TODO birthday
			// TODO breeder
			switch (vars.get("chevalSexe").replace("\'", "").toUpperCase()) {
				case "FEMININ": {
					characteristics.gender = Gender.FEMALE;
					break;
				}
				
				case "MASCULIN": {
					characteristics.gender = Gender.MALE;
					break;
				}
				
				default:{
					characteristics.gender = Gender.UNKNOWN;
					break;
				}
			}
			// TODO hide
			// TODO inventory
			// TODO race
			// TODO size
			// TODO species
			characteristics.weight = Integer.parseInt(vars.get("chevalPoids"));
			
			// Tasks
			tasks.age.available = !split1[1].contains("vieillir action-disabled");
			tasks.carrot.available = !split1[1].contains("carotte action-disabled");
			tasks.drink.available = !split1[1].contains("boire action-disabled");
			String heySliderSplit = split1[1].split("\"#feedingHayQuantityJoueur\"")[0];
			tasks.feed.maxHey = 22 - heySliderSplit.split("green disabled").length - heySliderSplit.split("green hiddenNumber disabled").length;
			tasks.feed.suggestedHey = heySliderSplit.split("alternative blue").length - 1;
			
			String[] tmp = split1[1].split("#feedingOatsQuantityJoueur");
			if(tmp.length > 1) {
				tasks.feed.hasOats = true;
				String oatsSliderSplit = tmp[0];
				tasks.feed.maxOats = 17 - oatsSliderSplit.split("green disabled").length - oatsSliderSplit.split("green hiddenNumber disabled").length;
				tasks.feed.suggestedOats = oatsSliderSplit.split("alternative blue").length -1;
			} else {
				tasks.feed.hasOats = false;
			}
			tasks.feed.available = tasks.feed.maxHey > 0 || tasks.feed.maxOats > 0;
			tasks.groom.available =!(split1[1].contains("panser-rainbow action-disabled") || split1[1].contains("panser action-disabled"));
			tasks.mash.available = !split1[1].contains("mash action-disabled") && characteristics.age.years >= 2;
			tasks.play.available = !split1[1].contains("jouer action-disabled");
			tasks.sleep.available = !(split1[1].contains("coucher-box action-disabled") || split1[1].contains("coucher action-disabled"));
			tasks.stroke.available = !split1[1].contains("caresser action-disabled");
			tasks.suckle.available = characteristics.age.years == 0 && characteristics.age.months < 6 && !split1[1].contains("allaiter action-disabled");
			tasks.centreMission.available = 
					(!split1[1].contains("missionEquus action-disabled")) && (split1[1].contains("missionEquus"))
					|| (!split1[1].contains("missionForet action-disabled")) && (split1[1].contains("boutonMissionForet")); // TODO more efficient
		
			// Boni
			// TODO all
			
			
		} catch(Exception e) {
			throw new ApiException(e, "Couldn't update horse");
		}
	}
	
}
