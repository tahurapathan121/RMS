package Entity;
import javax.persistence.*;
@Entity
@Table(name = "feedback")
public class Feedback 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_id")
    private int feedbackId;

   
    @Column(name = "staff_rating")
    private int staffRating;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customer;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;
   
	
    @Column(name = "item_rating")
    private String itemRating;
}