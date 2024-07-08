package model;

import Entity.Customers;

import javax.validation.constraints.NotNull;



import lombok.Data;

@Data
public class OrderDto 
{

	private Integer orderId;
	
	@NotNull
	private String orderDetails;
	
	private Customers customer;
}

