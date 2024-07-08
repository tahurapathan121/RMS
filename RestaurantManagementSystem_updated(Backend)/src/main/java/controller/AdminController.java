package controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Entity.Items;
import Entity.Staff;
import Entity.Tables;
import Entity.Order;
import Entity.Feedback;
import service.AdminService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8089")
public class AdminController {

    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    AdminService adminService;

    // For managing menu items

    @PostMapping("/addMenuItem")
    public ResponseEntity<String> addMenuItem(@RequestBody Items item) {
        try {
            adminService.addMenuItem(item);
            return new ResponseEntity<>("Menu item added successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error("Error adding menu item", e);
            return new ResponseEntity<>("Error adding menu item", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updateMenuItem")
    public ResponseEntity<String> updateMenuItem(@RequestBody Items item) {
        try {
            adminService.updateMenuItem(item);
            return new ResponseEntity<>("Menu item updated successfully", HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error updating menu item", e);
            return new ResponseEntity<>("Error updating menu item", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteMenuItem")
    public ResponseEntity<String> deleteMenuItem(@RequestBody Items item) {
        try {
            adminService.deleteMenuItem(item);
            return new ResponseEntity<>("Menu item deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error deleting menu item", e);
            return new ResponseEntity<>("Error deleting menu item", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/retrieveMenuItem/{itemId}")
    public ResponseEntity<Items> retrieveMenuItem(@PathVariable int itemId) {
        try {
            Items item = adminService.retrieveMenuItem(itemId);
            return new ResponseEntity<>(item, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error retrieving menu item", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // For managing staff

    @PostMapping("/addStaff")
    public ResponseEntity<String> addStaff(@RequestBody Staff staff) {
        try {
            adminService.addStaff(staff);
            return new ResponseEntity<>("Staff added successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error("Error adding staff", e);
            return new ResponseEntity<>("Error adding staff", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updateStaff")
    public ResponseEntity<String> updateStaff(@RequestBody Staff staff) {
        try {
            adminService.updateStaff(staff);
            return new ResponseEntity<>("Staff updated successfully", HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error updating staff", e);
            return new ResponseEntity<>("Error updating staff", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteStaff")
    public ResponseEntity<String> deleteStaff(@RequestBody Staff staff) {
        try {
            adminService.deleteStaff(staff);
            return new ResponseEntity<>("Staff deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error deleting staff", e);
            return new ResponseEntity<>("Error deleting staff", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/retrieveStaff/{staffId}")
    public ResponseEntity<Staff> retrieveStaff(@PathVariable int staffId) {
        try {
            Staff staff = adminService.retrieveStaff(staffId);
            return new ResponseEntity<>(staff, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error retrieving staff", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // For managing tables

    @PostMapping("/addTable")
    public ResponseEntity<String> addTable(@RequestBody Tables table) {
        try {
            adminService.addTable(table);
            return new ResponseEntity<>("Table added successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            logger.error("Error adding table", e);
            return new ResponseEntity<>("Error adding table", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updateTable")
    public ResponseEntity<String> updateTable(@RequestBody Tables table) {
        try {
            adminService.updateTable(table);
            return new ResponseEntity<>("Table updated successfully", HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error updating table", e);
            return new ResponseEntity<>("Error updating table", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteTable")
    public ResponseEntity<String> deleteTable(@RequestBody Tables table) {
        try {
            adminService.deleteTable(table);
            return new ResponseEntity<>("Table deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error deleting table", e);
            return new ResponseEntity<>("Error deleting table", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/retrieveTable/{tableId}")
    public ResponseEntity<Tables> retrieveTable(@PathVariable int tableId) {
        try {
            Tables table = adminService.retrieveTable(tableId);
            return new ResponseEntity<>(table, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error retrieving table", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // For viewing orders and feedback

    @GetMapping("/viewOrders")
    public ResponseEntity<List<Order>> viewOrders() {
        try {
            List<Order> orders = adminService.viewOrders();
            return new ResponseEntity<>(orders, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error viewing orders", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/viewFeedback")
    public ResponseEntity<List<Feedback>> getAllFeedback() {
        try {
            List<Feedback> feedback = adminService.getAllFeedback();
            return new ResponseEntity<>(feedback, HttpStatus.OK);
        } catch (Exception e) {
            logger.error("Error viewing feedback", e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

