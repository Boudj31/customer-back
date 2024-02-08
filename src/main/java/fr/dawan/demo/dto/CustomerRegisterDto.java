package fr.dawan.demo.dto;

public record CustomerRegisterDto(
        String username,
        String email,
        String password,
        String role,
        String firstName,
        String bio,
        String lastName
) {
}
