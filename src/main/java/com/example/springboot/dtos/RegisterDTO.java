package com.example.springboot.dtos;

import com.example.springboot.models.addons.UserRole;

public record RegisterDTO(String emailUser, String password, UserRole roleUser) {
}
