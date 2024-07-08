package model;


import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import Entity.Parcel;
import Entity.Feedback;
import Entity.Order;
import Entity.Tables;

import lombok.Data;

@Data
public class CustomersDto 
{
	
	private Integer customerId;
	
	@NotNull
	@Size(min = 2, max = 40, message = "Customer name should have minimum 2 and maximum 40 characters")
	private String customerName;
	
	@NotNull
	@Size(min = 2, max = 40, message = "Customer phone should have minimum 2 and maximum 40 characters")
	private String customerPhone;
	
	@NotNull
	@Size(max = 255, message = "Email address must not exceed 255 characters")
	private String customerEmail;
	
	@NotNull
	@Size(max = 255, message = "Password must not exceed 255 characters")
	private String customerPassword;
	
	private List<Parcel> parcels;
	private List<Feedback> feedbacks;
	private List<Order> orders;
	private List<Tables> tables;
}

