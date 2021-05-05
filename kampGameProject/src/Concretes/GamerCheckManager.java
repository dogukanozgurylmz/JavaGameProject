package Concretes;

import Abstracts.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {
	
	private String firstName = "Do�ukan �zg�r";
	private String lastName = "Y�lmaz";
	private String nationalityIdentity = "12345678901";
	private int birthYear = 2000;
	
	@Override
	public boolean confirm(Gamer gamer) {
		boolean result = this.firstName == gamer.getFirstName() && this.lastName == gamer.getLastName() && this.nationalityIdentity == gamer.getNationalIdentity() && this.birthYear == gamer.getBirthYear();
		if (result==true) {
			System.out.println("Giri� ba�ar�l�.");
			return true;
		}else {
			System.out.println("Giri� bilgileri hatal�.");
			return false;
		}
		
	}
	
	

}
