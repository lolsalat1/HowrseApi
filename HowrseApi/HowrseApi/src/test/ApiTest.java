package test;

import javax.swing.JOptionPane;

import api.API;
import api.API.SERVER_COUNTRY;
import api.Account;
import api.Breed;
import api.horse.Horse;
import api.request.requests.DefaultResponse;

public class ApiTest {

	public static void main(String[] args) {
		String username = JOptionPane.showInputDialog("Username");
		String password = JOptionPane.showInputDialog("Password");
		SERVER_COUNTRY locale = SERVER_COUNTRY.DE;
		
		try {
			Account account = new Account();
			account.api = new API(locale);
		
			DefaultResponse response = account.api.doLogin(username, password);
			
			if(response.sucess)
				System.out.println("OK");
			
			for(Breed b : account.api.getBreeds().values()) {
				System.out.println(b.name + " (" + b.id + "):");
				for(Horse h : b.horses.values()) {
					System.out.println("\t" + h.name + " (" + h.id + ")");
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
