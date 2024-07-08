package model;
import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import Entity.Order;

import java.util.List;

@Data
public class ItemsDto {
    private Integer itemId;

    @NotNull
    @Size(min = 2, max = 100, message = "Category should have minimum 2 and maximum 100 characters")
    private String category;

    @NotNull
    private Double price;

    @NotNull
    @Size(min = 2, max = 100, message = "Name should have minimum 2 and maximum 100 characters")
    private String name;

    @NotNull
    private Integer orderCount;

    private List<Order> orders;
}
