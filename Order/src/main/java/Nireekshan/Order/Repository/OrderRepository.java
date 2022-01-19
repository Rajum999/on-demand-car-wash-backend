package Nireekshan.Order.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Nireekshan.Order.Model.Order;

public interface OrderRepository extends MongoRepository<Order, Integer> {

}
