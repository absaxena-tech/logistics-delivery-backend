package com.example.AuthService.dto;

import com.example.AuthService.model.Role;
import com.example.AuthService.model.VehicleType;
import lombok.Data;

@Data
public class RegisterRequest {

    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private Role role;
    private VehicleType vehicleType;

}