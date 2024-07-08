package service;

import Entity.Feedback;
import Entity.Order;

public interface CustomersService 
{
	void placeOrder(Order order);

    void cancelOrder(int orderId);
    
    void provideFeedback(Feedback feedback);
}
