package nireekshan.Admin.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import nireekshan.Admin.Models.Ratings;
import nireekshan.Admin.Repository.RatingRepository;

public class RatingService {
	@Autowired
	RatingRepository repo;
	
	public String saverating(Ratings rating) {
		repo.save(rating);
		return " Thanks for Your Valuable feedback";
	
	}

	
	public List<Ratings> getuser() {
		
		return repo.findAll();
	}

	
}
