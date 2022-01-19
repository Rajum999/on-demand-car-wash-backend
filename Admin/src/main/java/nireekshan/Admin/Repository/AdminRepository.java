package nireekshan.Admin.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nireekshan.Admin.Models.Admin;

public interface AdminRepository extends MongoRepository<Admin, Integer> {

	Admin findByUsername(String username);
}
