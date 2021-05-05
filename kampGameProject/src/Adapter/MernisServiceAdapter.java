package Adapter;

import java.rmi.RemoteException;

import Abstracts.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@Override
	public boolean confirm(Gamer gamer) {
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(gamer.getNationalIdentity(), gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(), gamer.getBirthYear());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return false;
		
	}

}
