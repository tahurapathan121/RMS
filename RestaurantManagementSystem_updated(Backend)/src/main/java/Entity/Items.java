package Entity;
import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "items")
public class Items 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private int itemId;
    
    
	@Column(name = "category")
    private String category;

    @Column(name = "price")
    private double price;
    
    
    @Column(name = "name")
    private String name;

    @Column(name = "order_count")
    private int orderCount;

    // Establishing one-to-many relationship with Order entity
    @OneToMany(mappedBy = "item")
    private List<Order> orders;
}
