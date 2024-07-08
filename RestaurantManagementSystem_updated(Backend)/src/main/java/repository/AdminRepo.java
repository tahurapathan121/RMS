package repository;
import Entity.Admin;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdminRepo extends JpaRepository<Admin, Integer> 
{
    
    // Example of custom query method
    // we can Add custom queries as per your requirements
}

