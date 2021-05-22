package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.repository.ContractRepository;

@Service
public class ContractServiceImpl implements IContractService {

	private static final Logger l = LogManager.getLogger(ContractServiceImpl.class);

	@Autowired
	ContractRepository contractRepository;

	@Override
	public List<Contrat> retrieveAllContracts() {
		l.info("retrieveAllContracts");
		return (List<Contrat>) contractRepository.findAll();
	}

	@Override
	public Contrat addContract(Contrat u) {
		l.info("addContract");
		return contractRepository.save(u);
	}

	@Override
	public void deleteContract(int id) {
		contractRepository.deleteById(id);
		l.info("in  deleteContract with id = " + id);
	}

	@Override
	public Contrat updateContract(Contrat u) {
		l.info("updateContract");
		return contractRepository.save(u);
	}

	@Override
	public Contrat getContractById(int id) {
		l.info("getContractById");
		return contractRepository.findById(id).get();
	}

}
