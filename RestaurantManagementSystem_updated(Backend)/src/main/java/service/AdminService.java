package service;
import java.util.List;

import Entity.Admin;
import Entity.Feedback;
import Entity.Items;
import Entity.Order;
import Entity.Staff;
import Entity.Tables;

public interface AdminService 
{
	// For managing menu items
    String addMenuItem(Items item);
    String updateMenuItem(Items item);
    String deleteMenuItem(Items item);
    Items retrieveMenuItem(int itemId);

    // For managing staff
    String addStaff(Staff staff);
    String updateStaff(Staff staff);
    String deleteStaff(Staff staff);
    Staff retrieveStaff(int staffId);

    // For managing tables
    String addTable(Tables table);
    String updateTable(Tables table);
    String deleteTable(Tables table);
    Tables retrieveTable(int tableId);

    // For viewing orders and feedback
    List<Order> viewOrders();
    List<Feedback> getAllFeedback();
}
