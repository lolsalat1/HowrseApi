package test;

import javax.swing.JOptionPane;

import api.API;
import api.API.SERVER_COUNTRY;
import api.Account;
import api.Breed;
import api.horse.Horse;
import api.request.MiscRequests;
import api.request.RequestHandler;
import api.request.requests.DefaultResponse;

public class ApiTest {

	public static void main(String[] args) {
		
		// NEXT play etc.
		
		String username = JOptionPane.showInputDialog("Username");
		String password = JOptionPane.showInputDialog("Password");
		SERVER_COUNTRY locale = SERVER_COUNTRY.DE;
		
		try {
			Account account = new Account();
			account.api = new API(locale);
			
			RequestHandler.debug = false;
			
			DefaultResponse response = account.api.doLogin(username, password);
			
			if(!response.sucess) {
				System.err.println("LOGIN FAILED!");
				System.exit(-1);
			}
				
			// ITERATES THROUGH ALL BREEDS
			for(Breed b : account.api.getBreeds().values()) {
				System.out.println(b.name + " (" + b.id + "):");
				
				// UPDATES HORSES OF CURRENT BREAD (IMPORTANT)
				b.updateHorses(account.api);
				
				// ITERATES THROUGH ALL HORSES OF CURRENT BREAD
				for(Horse h : b.horses.values()) {
					System.out.println("\t" + h.name + " (" + h.id + ")");
					
					// UPDATES HORSE (IMPORTANT)
					h.updateHorse(account.api);
					
					//  CHECKS IF TASKS ARE AVAILABLE AND PERFORMS THEN IF THEY ARE
					
					if(h.tasks.drink.available) {
						if(h.tasks.drink.performTask(h, account.api).sucess) {
							System.out.println("DRINK OK");
						} else {
							System.out.println("DRINK FAIL");
						}
					}
					
					if(h.tasks.stroke.available) {
						if(h.tasks.stroke.performTask(h, account.api).sucess) {
							System.out.println("STROKE OK");
						} else {
							System.out.println("STROKE FAIL");
						}
					}
					
					if(h.tasks.groom.available) {
						if(h.tasks.groom.performTask(h, account.api).sucess) {
							System.out.println("GROOM OK");
						} else {
							System.out.println("GROOM FAIL");
						}
					}
					
					if(h.tasks.carrot.available) {
						if(h.tasks.carrot.performTask(h, account.api).sucess) {
							System.out.println("CARROT OK");
						} else {
							System.out.println("CARROT FAIL");
						}
					}
					
					if(h.tasks.mash.available) {
						if(h.tasks.mash.performTask(h, account.api).sucess) {
							System.out.println("MASH OK");
						} else {
							System.out.println("MASH FAIL");
						}
					}
					
					if(h.tasks.suckle.available) {
						if(h.tasks.suckle.performTask(h, account.api).sucess) {
							System.out.println("SUCKLE OK");
						} else {
							System.out.println("SUCKLE FAIL");
						}
					}
					
					if(h.tasks.feed.isSuggested()) {
						if(h.tasks.feed.performTask(h, account.api).sucess){
							System.out.println("FEED OK");
						} else {
							System.out.println("FEED FAIL");
						}
					}
					
					if(h.tasks.sleep.available) {
						if(h.tasks.sleep.performTask(h, account.api).sucess){
							System.out.println("SLEEP OK");
						} else {
							System.out.println("SLEEP FAIL");
						}
					}
					
					
					// UPDATES HORSE IN THE END (IF WE WANTED TO USE IT LATER)
					h.updateHorse(account.api);
				}
			}
			
			Thread.sleep(5500);
			
			// LOGOUT
			if(MiscRequests.logout(account.api).sucess) {
				System.out.println("LOGOUT OK");
			} else {
				System.out.println("LOGOUT FAIL");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
