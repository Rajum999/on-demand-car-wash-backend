package Nireekshan.Payment.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Nireekshan.Payment.Model.PaymentModel;


public interface PaymentRepository extends MongoRepository<PaymentModel, Integer> {




}
