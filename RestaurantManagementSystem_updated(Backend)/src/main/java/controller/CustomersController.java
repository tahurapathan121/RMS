package controller;
import org.springframework.beans.factory.annotation.Autowired; // Import for dependency injection

import org.springframework.web.bind.annotation.*; // Import for REST controller annotations

import Entity.Feedback; // Import the Feedback entity
import Entity.Order; // Import the Order entity
import service.CustomersService; // Import the CustomersService interface

@RestController // Mark this class as a Spring REST controller
@RequestMapping("/customers") // Base URL mapping for the controller
@CrossOrigin(origins = "http://localhost:8089")
public class CustomersController 
{

    @Autowired // Inject the CustomersService dependency
    private CustomersService customersService;

    // For placing orders

    @PostMapping("/placeOrder") // Handle POST requests for placing orders
    public String placeOrder(@RequestBody Order order) // Define a method for placing an order
    {
        customersService.placeOrder(order); // call to service
        return "Order placed successfully"; 
    }

    // For canceling orders

    @DeleteMapping("/cancelOrder/{orderId}") // Handle DELETE requests for canceling orders
    public String cancelOrder(@PathVariable int orderId)// Define a method for canceling an order
    { 
        customersService.cancelOrder(orderId); // call to service
        return "Order cancelled successfully"; 
    }

    // For providing feedback

    @PostMapping("/provideFeedback") // Handle POST requests for providing feedback
    public String provideFeedback(@RequestBody Feedback feedback)  // Define a method for providing feedback
    {
        customersService.provideFeedback(feedback); //  call to service
        return "Feedback provided successfully"; 
    }
}
