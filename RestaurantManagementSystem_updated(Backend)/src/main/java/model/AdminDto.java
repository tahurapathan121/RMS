package model;
import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import Entity.Staff;

import java.util.List;

@Data
public class AdminDto 
{
    private Integer adminId;

    @NotNull
    @Size(min = 2, max = 40, message = "Admin name should have minimum 2 and maximum 40 characters")
    private String adminName;

    @NotNull
    @Size(min = 2, max = 40, message = "Admin phone should have minimum 2 and maximum 40 characters")
    private String adminPhone;

    @NotNull
    @Size(max = 255, message = "Email address must not exceed 255 characters")
    private String adminEmail;

    @NotNull
    @Size(max = 255, message = "Password must not exceed 255 characters")
    private String adminPassword;

    private List<Staff> staffList;  // Assuming an admin is related to multiple staff members
}

