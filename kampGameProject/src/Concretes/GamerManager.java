package Concretes;

import Abstracts.GamerCheckService;
import Abstracts.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if (this.gamerCheckService.confirm(gamer)) {
			System.out.println("--> Oyuncu eklendi : " + gamer.getFirstName());
		}
		
	}

	@Override
	public void update(Gamer gamer) {

		if (this.gamerCheckService.confirm(gamer)) {
			System.out.println("--> Oyuncu güncellendi : " + gamer.getFirstName());
		}
		
	}

	@Override
	public void delete(Gamer gamer) {

		System.out.println("--> Oyuncu silindi : " + gamer.getFirstName());
		
	}

}
