package repository;
import Entity.Staff;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StaffRepo extends JpaRepository<Staff, Integer> 
{
    
    // Example of custom query method
    // Add custom queries as per your requirements
}

