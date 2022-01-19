package nireekshan.Admin.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nireekshan.Admin.Models.Ratings;

public interface RatingRepository extends MongoRepository<Ratings, Integer> {

}
