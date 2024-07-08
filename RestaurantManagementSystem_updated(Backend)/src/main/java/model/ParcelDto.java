package model;

import Entity.Customers;


import javax.validation.constraints.NotNull;



import lombok.Data;

@Data
public class ParcelDto 
{

	private Integer parcelId;
	
	@NotNull
	private String parcelDetails;
	
	private Customers customer;
}

