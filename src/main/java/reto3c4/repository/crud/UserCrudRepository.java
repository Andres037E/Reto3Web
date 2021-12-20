package reto3c4.repository.crud;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import reto3c4.model.User;

import java.util.Optional;

public interface UserCrudRepository extends MongoRepository<User,Integer> {
    Optional<User> findByEmail(String email);
    Optional<User>findByEmailAndPassword(String email, String password);
    Optional<User>findByNameOrEmail(String name, String email);
    List<User> findByMonthBirthtDay(String month);
    
}
