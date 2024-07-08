package model;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import Entity.Admin;

@Data
public class StaffDto {
    private Integer staffId;

    @NotNull
    @Size(min = 2, max = 100, message = "Staff name should have minimum 2 and maximum 100 characters")
    private String staffName;

    @NotNull
    @Size(min = 2, max = 40, message = "Staff phone should have minimum 2 and maximum 40 characters")
    private String staffPhone;

    @NotNull
    @Size(max = 255, message = "Email address must not exceed 255 characters")
    private String staffEmail;

    @NotNull
    @Size(max = 255, message = "Password must not exceed 255 characters")
    private String staffPassword;

    private String position;

    private Admin admin;  // Assuming a staff member is related to an admin
}

