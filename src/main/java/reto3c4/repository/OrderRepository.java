package reto3c4.repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reto3c4.model.Order;
import reto3c4.repository.crud.OrderCrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepository {
    @Autowired
    private OrderCrudRepository orderCrudRepository;

    public List<Order> getAll() {
        return orderCrudRepository.findAll();
    }
    public Optional<Order> getOrder(Integer id){
        return orderCrudRepository.findById(id);
    }

    public Order save(Order order) {
        return orderCrudRepository.save(order);
    }

    public void update(Order order){
        orderCrudRepository.save(order);
    }

    public void delete (Order order){
        orderCrudRepository.delete(order);
    }


    public List<Order> getOrderByZone(String zone){
        return orderCrudRepository.findBySalesManZone(zone);
    }
    public List<Order> getOrderBySalesManId(int id ){
        return orderCrudRepository.findBySalesManId(id);
    }
    public List<Order> getOrderBySalesManIdAndStatus(int id, String status){
        return orderCrudRepository.findBySalesManIdAndStatus(id, status);
    }
    public List<Order> getByRegisterDayAndSalesManId(String registerDay, Integer id){
	        try {
	            return orderCrudRepository.findByRegisterDayAndSalesManId(new SimpleDateFormat("yyyy-MM-dd").parse(registerDay), id);
	        } catch (ParseException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }


}
