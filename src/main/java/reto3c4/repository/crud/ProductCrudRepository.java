package reto3c4.repository.crud;

import org.springframework.data.mongodb.repository.MongoRepository;
import reto3c4.model.Product;

public interface ProductCrudRepository extends MongoRepository<Product, String> {
}
