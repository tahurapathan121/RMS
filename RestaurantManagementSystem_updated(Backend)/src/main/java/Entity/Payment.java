package Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "payment")
public class Payment 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int paymentId;
    
    
	@Column(name="OrderID")
	private int orderID;

    
    @Column(name = "amount")
    private double amount;

   
    @Column(name = "payment_type")
    private String paymentType;
    
   
	@Column(name="RegistrationDate",length=20)
	private LocalDate paymentDate;
    
	@Column(name = "customer_id")
    private int customerId;
}