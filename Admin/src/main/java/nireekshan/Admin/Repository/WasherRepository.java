package nireekshan.Admin.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nireekshan.Admin.Models.Washer;

public interface WasherRepository extends MongoRepository<Washer, Integer> {
	
	Washer findByUsername(String username);

}
