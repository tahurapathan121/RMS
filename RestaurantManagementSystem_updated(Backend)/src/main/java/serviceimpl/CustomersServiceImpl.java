package serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Entity.Customers;
import Entity.Feedback;
import Entity.Order;
import repository.CustomersRepo;
import repository.FeedbackRepo;
import service.CustomersService;

@Service
public class CustomersServiceImpl implements CustomersService {

    @Autowired
    private CustomersRepo customersRepository;

    @Autowired
    private FeedbackRepo feedbackRepository;

    @Override
    public void placeOrder(Order order) 
    {
        // Assuming order validation and business logic are handled before saving
        // Implementation logic would typically involve saving the order to the database
        customersRepository.save(order.getCustomer()); // Save the customer associated with the order
        customersRepository.save(order); // Save the order itself
    }

    @Override
    public void cancelOrder(int orderId) 
    {
        // Assuming cancellation logic involves updating order status or removing from database
        customersRepository.deleteById(orderId);
    }

    @Override
    public void provideFeedback(Feedback feedback) 
    {
        // Assuming validation and business logic are handled before saving
        feedbackRepository.save(feedback); // Save the feedback
    }
}

