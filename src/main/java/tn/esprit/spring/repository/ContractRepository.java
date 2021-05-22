package tn.esprit.spring.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Contrat;



@Repository
public interface ContractRepository extends  CrudRepository<Contrat, Integer> {

	

}
