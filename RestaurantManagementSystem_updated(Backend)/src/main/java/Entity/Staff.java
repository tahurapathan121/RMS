package Entity;
import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "staff")
public class Staff 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    private int staffId;
    
   
    @Column(name = "staff_name")
    private String staffName;
    
   
    @Column(name = "staff_rating")
    private double staffRating;
    
    
    @Column(name = "staff_email")
    private String staffEmail;

    // Establishing one-to-many relationship with Feedback entity
    @OneToMany(mappedBy = "staff")
    private List<Feedback> feedbacks;
}