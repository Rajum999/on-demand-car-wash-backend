package Nireekshan.Washer.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Nireekshan.Washer.Model.Washer;

public interface WasherRepository extends MongoRepository<Washer, Integer> {

	Washer findByUsername(String username);
}
