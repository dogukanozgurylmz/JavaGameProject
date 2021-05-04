package Concretes;

import Abstracts.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) {
		double afterPrice = game.getPrice()-(game.getPrice()*campaign.getRate()/100);
		System.out.println("Say�n " + gamer.getfullName() + ", " + campaign.getName() + " kampanyas� uyguland�. " + game.getName() + " oyununun fiyat� " + afterPrice + "TL");
		
	}

}
