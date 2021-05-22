package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Contrat;



public interface IContractService {
	
	List<Contrat> retrieveAllContracts(); 
	Contrat addContract(Contrat u);
	void deleteContract(int id);
	Contrat updateContract(Contrat u);
	Contrat getContractById(int id);

}
