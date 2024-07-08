package repository;
import Entity.Customers;
import Entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface CustomersRepo extends JpaRepository<Customers, Integer> 
{

	void save(Order order);
  
}

