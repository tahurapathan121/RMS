package repository;
import Entity.Feedback;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface FeedbackRepo extends JpaRepository<Feedback, Integer> 
{
    
    // Example of custom query method
    // Add custom queries as per your requirements
}

