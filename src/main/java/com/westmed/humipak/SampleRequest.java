package com.westmed.humipak;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record SampleRequest(
        @NotBlank @Size(max = 100) String name,
        @NotBlank @Size(max = 150) String organisation,
        @NotBlank @Email String email,
        @Size(max = 30) String phone,
        @Size(max = 1000) String message) {}
