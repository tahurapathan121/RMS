package Entity;
import javax.persistence.*;

@Entity
@Table(name = "tables")
public class Tables 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "table_number")
    private int tableNumber;

    @Column(name = "total_people")
    
    private int totalPeople;

    @Column(name = "time")
    private String time;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customer;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Items item;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
