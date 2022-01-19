package Nireekshan.Customer.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Nireekshan.Customer.Model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer>{
	
	Customer findByUsername(String username);
	
}
