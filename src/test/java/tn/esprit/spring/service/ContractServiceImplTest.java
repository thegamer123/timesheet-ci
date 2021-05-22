package tn.esprit.spring.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IContractService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContractServiceImplTest {

	@Autowired
	IContractService contractService;

	//@Test
	//public void testRetrieveAllContracts() {
		//List<Contrat> list = contractService.retrieveAllContracts(); 
		// if there are 7 users in DB : 
		//Assert.assertEquals(1, list.size());
	//}
	
	
	@Test
	public void testAddContract() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2021-05-21");
		Contrat  c = new Contrat(d , "CDI", 1250); 
		Contrat added = contractService.addContract(c); 
		Assert.assertEquals(c.getReference(), added.getReference());
	}
 
	
}
