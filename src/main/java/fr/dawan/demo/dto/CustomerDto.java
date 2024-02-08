package fr.dawan.demo.dto;

import java.util.UUID;

public record CustomerDto(
        UUID id,
        String username,
        String email,
        String role,
        String firstName,
        String bio,
        String lastName,
        boolean active
) {
}
