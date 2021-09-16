package main;

import automobil.Automobil;
import gui.Logingui.Login;
import taxisluzba.TaxiSluzba;

public class Main {
	
	public static void main(String[] args) {
		TaxiSluzba taxisluzba = new TaxiSluzba();


        for (Automobil automobil : taxisluzba.sviAutomobili()) {
            System.out.println(automobil);
        }
        Login login = new Login(taxisluzba);
        login.setVisible(true);
        // TaxiSluzba.login();
		
	}
}
