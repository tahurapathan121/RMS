package repository;
import Entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepo extends JpaRepository<Order, Integer> {
    
    // Example of custom query method
    // Add custom queries as per your requirements
}

