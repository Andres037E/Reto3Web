package reto3c4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reto3c4.repository.ProductRepository;
import reto3c4.repository.UserRepository;
import reto3c4.repository.crud.OrderCrudRepository;
import reto3c4.repository.crud.ProductCrudRepository;
import reto3c4.repository.crud.UserCrudRepository;

@SpringBootApplication
public class Reto3C4Application implements CommandLineRunner {


        @Autowired
        private ProductCrudRepository productRepository;

        @Autowired
        private UserCrudRepository userRepository;

        @Autowired
        private OrderCrudRepository orderRepository;

        public static void main(String[] args) {SpringApplication.run(Reto3C4Application.class, args);}

    @Override
    public void run(String... args) throws Exception {
     userRepository.deleteAll();
     productRepository.deleteAll();
     orderRepository.deleteAll();

    }
}
