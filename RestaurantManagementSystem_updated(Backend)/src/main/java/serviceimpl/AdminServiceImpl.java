package serviceimpl;

import java.util.Collections;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Items;
import Entity.Staff;
import Entity.Tables;
import Entity.Order;
import Entity.Feedback;
import repository.ItemsRepo;
import repository.StaffRepo;
import repository.TablesRepo;
import repository.OrderRepo;
import repository.FeedbackRepo;
import service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

    private static final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

    @Autowired
    private ItemsRepo itemsRepository;

    @Autowired
    private StaffRepo staffRepository;

    @Autowired
    private TablesRepo tablesRepository;

    @Autowired
    private OrderRepo orderRepository;

    @Autowired
    private FeedbackRepo feedbackRepository;

    // For managing menu items
    @Override
    public String addMenuItem(Items item) {
        try 
        {
            itemsRepository.save(item);
            logger.info("Menu item added successfully: {}", item);
            return "Menu item added successfully";
        } 
        catch (Exception e) 
        {
            logger.error("Error adding menu item: {}", e.getMessage(), e);
            return "Error adding menu item";
        }
    }

    @Override
    public String updateMenuItem(Items item) {
        try {
            itemsRepository.save(item);
            logger.info("Menu item updated successfully: {}", item);
            return "Menu item updated successfully";
        } catch (Exception e) {
            logger.error("Error updating menu item: {}", e.getMessage(), e);
            return "Error updating menu item";
        }
    }

    @Override
    public String deleteMenuItem(Items item) 
    {
        try 
        {
            itemsRepository.delete(item);
            logger.info("Menu item deleted successfully: {}", item);
            return "Menu item deleted successfully";
        } 
        catch (Exception e) 
        {
            logger.error("Error deleting menu item: {}", e.getMessage(), e);
            return "Error deleting menu item";
        }
    }

    @Override
    public Items retrieveMenuItem(int itemId) 
    {
        try 
        {
            return itemsRepository.findById(itemId).orElse(null);
        } 
        catch (Exception e) 
        {
            logger.error("Error retrieving menu item with ID {}: {}", itemId, e.getMessage(), e);
            return null;
        }
    }

    @Override
    public String addStaff(Staff staff) {
        try {
            staffRepository.save(staff);
            logger.info("Staff added successfully: {}", staff);
            return "Staff added successfully";
        } catch (Exception e) {
            logger.error("Error adding staff: {}", e.getMessage(), e);
            return "Error adding staff";
        }
    }

    @Override
    public String updateStaff(Staff staff) {
        try {
            staffRepository.save(staff);
            logger.info("Staff updated successfully: {}", staff);
            return "Staff updated successfully";
        } catch (Exception e) {
            logger.error("Error updating staff: {}", e.getMessage(), e);
            return "Error updating staff";
        }
    }

    @Override
    public String deleteStaff(Staff staff) {
        try {
            staffRepository.delete(staff);
            logger.info("Staff deleted successfully: {}", staff);
            return "Staff deleted successfully";
        } catch (Exception e) {
            logger.error("Error deleting staff: {}", e.getMessage(), e);
            return "Error deleting staff";
        }
    }

    @Override
    public Staff retrieveStaff(int staffId) {
        try {
            return staffRepository.findById(staffId).orElse(null);
        } catch (Exception e) {
            logger.error("Error retrieving staff with ID {}: {}", staffId, e.getMessage(), e);
            return null;
        }
    }
    @Override
    public String addTable(Tables table) {
        try {
            tablesRepository.save(table);
            logger.info("Table added successfully: {}", table);
            return "Table added successfully";
        } catch (Exception e) {
            logger.error("Error adding table: {}", e.getMessage(), e);
            return "Error adding table";
        }
    }

    @Override
    public String updateTable(Tables table) {
        try {
            tablesRepository.save(table);
            logger.info("Table updated successfully: {}", table);
            return "Table updated successfully";
        } catch (Exception e) {
            logger.error("Error updating table: {}", e.getMessage(), e);
            return "Error updating table";
        }
    }

    @Override
    public String deleteTable(Tables table) {
        try {
            tablesRepository.delete(table);
            logger.info("Table deleted successfully: {}", table);
            return "Table deleted successfully";
        } catch (Exception e) {
            logger.error("Error deleting table: {}", e.getMessage(), e);
            return "Error deleting table";
        }
    }

    @Override
    public Tables retrieveTable(int tableId) {
        try {
            return tablesRepository.findById(tableId).orElse(null);
        } catch (Exception e) {
            logger.error("Error retrieving table with ID {}: {}", tableId, e.getMessage(), e);
            return null;
        }
    }

    @Override
    public List<Order> viewOrders() {
        try {
            return orderRepository.findAll();
        } catch (Exception e) {
            logger.error("Error retrieving orders: {}", e.getMessage(), e);
            return Collections.emptyList();
        }
    }

    @Override
    public List<Feedback> getAllFeedback() 
    {
        try 
        {
            return feedbackRepository.findAll();
        } catch (Exception e) {
            logger.error("Error retrieving feedback: {}", e.getMessage(), e);
            return Collections.emptyList();
        }
    }
    
}

   


