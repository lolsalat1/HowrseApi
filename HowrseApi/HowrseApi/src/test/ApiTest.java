package test;

import javax.swing.JOptionPane;

import api.API;
import api.API.SERVER_COUNTRY;
import api.request.requests.DefaultResponse;

public class ApiTest {

	public static void main(String[] args) {
		String username = JOptionPane.showInputDialog("Username");
		String password = JOptionPane.showInputDialog("Password");
		SERVER_COUNTRY locale = SERVER_COUNTRY.DE;
		
		try {
			API api = new API(locale);
			DefaultResponse response = api.doLogin(username, password);
			if(response.sucess)
				System.out.println("OK");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
