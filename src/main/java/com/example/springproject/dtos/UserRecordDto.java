package com.example.springproject.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRecordDto(@NotBlank String name, @Email String email, @NotBlank String password, @NotBlank String phone) {
}
