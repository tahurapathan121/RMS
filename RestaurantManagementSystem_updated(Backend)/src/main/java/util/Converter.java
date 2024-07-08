package util;
import model.AdminDto;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import Entity.Admin;
import Entity.Customers;
import Entity.Feedback;
import Entity.Items;
import Entity.Order;
import Entity.Parcel;
import Entity.Payment;
import Entity.Staff;
import Entity.Tables;
import model.AdminDto;
import model.CustomersDto;
import model.FeedbackDto;
import model.ItemsDto;
import model.OrderDto;
import model.ParcelDto;
import model.PaymentDto;
import model.StaffDto;
import model.TablesDto;

@Component
public class Converter {

    // Convert from AdminDTO to Admin entity
    public Admin convertToAdminEntity(AdminDto adminDTO) 
    {
        Admin admin = new Admin();
        if (adminDTO != null) 
        {
            BeanUtils.copyProperties(adminDTO, admin);
        }
        return admin;
    }

    // Convert from Admin entity to AdminDTO
    public AdminDto convertToAdminDTO(Admin admin) 
    {
        AdminDto adminDTO = new AdminDto();
        if (admin != null) 
        {
            BeanUtils.copyProperties(admin, adminDTO);
        }
        return adminDTO;
    }

    // Convert from CustomersDto to Customers entity
    public Customers convertToCustomersEntity(CustomersDto customersDto) 
    {
        Customers customers = new Customers();
        if (customersDto != null) 
        {
            BeanUtils.copyProperties(customersDto, customers);
        }
        return customers;
    }

    // Convert from Customers entity to CustomersDto
    public CustomersDto convertToCustomersDto(Customers customers) 
    {
        CustomersDto customersDto = new CustomersDto();
        if (customers != null) 
        {
            BeanUtils.copyProperties(customers, customersDto);
        }
        return customersDto;
    }

    // Convert from ItemsDTO to Items entity
    public Items convertToItemsEntity(ItemsDto itemsDTO) 
    {
        Items items = new Items();
        if (itemsDTO != null) 
        {
            BeanUtils.copyProperties(itemsDTO, items);
        }
        return items;
    }

    // Convert from Items entity to ItemsDTO
    public ItemsDto convertToItemsDTO(Items items) 
    {
        ItemsDto itemsDTO = new ItemsDto();
        if (items != null) 
        {
            BeanUtils.copyProperties(items, itemsDTO);
        }
        return itemsDTO;
    }

    // Similarly, add methods for other entities like Parcel, Staff, Order, Feedback, Tables, Payment
    // Converters for Parcel
    public Parcel convertToParcelEntity(ParcelDto parcelDTO) 
    {
        Parcel parcel = new Parcel();
        if (parcelDTO != null) 
        {
            BeanUtils.copyProperties(parcelDTO, parcel);
        }
        return parcel;
    }

    public ParcelDto convertToParcelDTO(Parcel parcel) 
    {
        ParcelDto parcelDTO = new ParcelDto();
        if (parcel != null) 
        {
            BeanUtils.copyProperties(parcel, parcelDTO);
        }
        return parcelDTO;
    }

    // Converters for Staff
    public Staff convertToStaffEntity(StaffDto staffDTO) 
    {
        Staff staff = new Staff();
        if (staffDTO != null) {
            BeanUtils.copyProperties(staffDTO, staff);
        }
        return staff;
    }

    public StaffDto convertToStaffDTO(Staff staff) 
    {
        StaffDto staffDTO = new StaffDto();
        if (staff != null) 
        {
            BeanUtils.copyProperties(staff, staffDTO);
        }
        return staffDTO;
    }

    // Converters for Order
    public Order convertToOrderEntity(OrderDto orderDTO) 
    {
        Order order = new Order();
        if (orderDTO != null) 
        {
            BeanUtils.copyProperties(orderDTO, order);
        }
        return order;
    }

    public OrderDto convertToOrderDTO(Order order) 
    {
        OrderDto orderDTO = new OrderDto();
        if (order != null) 
        {
            BeanUtils.copyProperties(order, orderDTO);
        }
        return orderDTO;
    }

    // Converters for Feedback
    public Feedback convertToFeedbackEntity(FeedbackDto feedbackDTO) 
    {
        Feedback feedback = new Feedback();
        if (feedbackDTO != null) 
        {
            BeanUtils.copyProperties(feedbackDTO, feedback);
        }
        return feedback;
    }

    public FeedbackDto convertToFeedbackDTO(Feedback feedback) 
    {
        FeedbackDto feedbackDTO = new FeedbackDto();
        if (feedback != null) 
        {
            BeanUtils.copyProperties(feedback, feedbackDTO);
        }
        return feedbackDTO;
    }

    // Converters for Tables
    public Tables convertToTablesEntity(TablesDto tablesDTO) 
    {
        Tables tables = new Tables();
        if (tablesDTO != null) 
        {
            BeanUtils.copyProperties(tablesDTO, tables);
        }
        return tables;
    }

    public TablesDto convertToTablesDTO(Tables tables) 
    {
        TablesDto tablesDTO = new TablesDto();
        if (tables != null) 
        {
            BeanUtils.copyProperties(tables, tablesDTO);
        }
        return tablesDTO;
    }

    // Converters for Payment
    public Payment convertToPaymentEntity(PaymentDto paymentDTO) 
    {
        Payment payment = new Payment();
        if (paymentDTO != null) 
        {
            BeanUtils.copyProperties(paymentDTO, payment);
        }
        return payment;
    }

    public PaymentDto convertToPaymentDTO(Payment payment) 
    {
        PaymentDto paymentDTO = new PaymentDto();
        if (payment != null) 
        {
            BeanUtils.copyProperties(payment, paymentDTO);
        }
        return paymentDTO;
    }
}

