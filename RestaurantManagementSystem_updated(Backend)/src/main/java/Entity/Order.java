package Entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "time")
    private String time;

    @Column(name = "amount")
    private double amount;

    // Establishing many-to-one relationship with Customers entity
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customer;

    // Establishing many-to-one relationship with Items entity
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Items item;

	public Order getCustomer() 
	{
		
		return null;
	}
}