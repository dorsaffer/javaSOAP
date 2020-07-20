package inetrface;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import entities.Evenement;


@Remote
@WebService(name="EvenementPortype" , targetNamespace="http://www.gestionEvenement.tn/")
public interface InterfaceRemote {

	
	@WebResult(name="numeroConfirmation")
	@WebMethod(operationName="inscriptionEvenement")
        public int inscriptionEvenement(@WebParam(name="id") int id,
			@WebParam(name="date") String date,
			@WebParam(name="lieu")  String lieu,
			@WebParam(name="capacite")  String cap,
			@WebParam(name="entreprise") String entreprise ,
			@WebParam(name="menu") boolean menu);
	
	@WebResult(name="listeEvenements")
	@WebMethod(operationName="gestionListEvenement")
       public  List<Evenement> gestionListEvenement();
	
	
	
	@WebResult(name="infoEvenement")
	@WebMethod(operationName="getInfoEvenement")
        public Evenement getInfoEvenement(@WebParam(name="id") int id);
	
	
	
}