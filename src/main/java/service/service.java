package service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;

import entities.Evenement;
import inetrface.InterfaceRemote;

@Stateless
@WebService(serviceName="EvenementService" , portName="EvenementPort", endpointInterface="inetrface.InterfaceRemote")
public class service implements InterfaceRemote {

	

	@Override
	public List<Evenement> gestionListEvenement() {
		List<Evenement> list=new ArrayList<>();
		
		Evenement e1= new Evenement(1,"27-25-2020","IBM",150,"hotel acrolpole",true);
		Evenement e2= new Evenement(2,"29-01-2020","cisco",300,"hotel Concord",false);
		list.add(e1);
		list.add(e2);
		return list;
	}

	@Override
	public int inscriptionEvenement(int id, String date, String lieu, String cap, String entreprise, boolean menu) {
		// TODO Auto-generated method stub
		return 1234567;
	}

	@Override
	public Evenement getInfoEvenement(int id) {
		Evenement e1= new Evenement(1,"27-25-2020","IBM",150,"hotel acrolpole",true);
		return e1;
	}
	

}
