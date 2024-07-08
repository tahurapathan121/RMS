package repository;
import Entity.Items;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface ItemsRepo extends JpaRepository<Items, Integer> 
{
    
    // Example of custom query method
    @Query("SELECT i FROM Items i WHERE i.name = ?1")
    Items findByName(String name);
    
    // Add more custom query methods if needed
}

