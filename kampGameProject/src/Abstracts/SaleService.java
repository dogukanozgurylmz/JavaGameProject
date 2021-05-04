package Abstracts;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	
	void sell(Gamer gamer, Game game, Campaign campaign);

}
