package reto3c4.repository.crud;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import reto3c4.model.Product;

public interface ProductCrudRepository extends MongoRepository<Product, String> {
    public List<Product> findByPriceLessThanEqual(double price);
    public List<Product> findByDescriptionContainingIgnoreCase(String description);
}
