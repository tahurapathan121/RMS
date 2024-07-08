package model;

import javax.validation.constraints.NotNull;

import Entity.Customers;

import lombok.Data;

@Data
public class FeedbackDto {

	private Integer feedbackId;
	
	@NotNull
	private String feedbackDetails;
	
	private Customers customer;
}
