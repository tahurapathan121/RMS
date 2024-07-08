package model;
import Entity.Customers;

import javax.validation.constraints.NotNull;


import lombok.Data;

@Data
public class TablesDto 
{

	private Integer tableId;
	
	@NotNull
	private String tableDetails;
	
	private Customers customer;
}

