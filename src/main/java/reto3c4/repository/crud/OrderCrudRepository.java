package reto3c4.repository.crud;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import reto3c4.model.Order;


import java.util.List;


public interface OrderCrudRepository extends MongoRepository<Order, Integer>{


public List<Order> findBySalesManZone(String zone);




}
