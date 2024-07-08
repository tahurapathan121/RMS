package model;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import Entity.Order;

import java.util.Date;

@Data
public class PaymentDto {
    private Integer paymentId;

    @NotNull
    private Double amount;

    @NotNull
    private Date paymentDate;

    @NotNull
    @Size(min = 2, max = 100, message = "Payment method should have minimum 2 and maximum 100 characters")
    private String paymentMethod;

    private Order order;  // Assuming a payment is related to an order
}

