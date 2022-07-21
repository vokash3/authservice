package ru.wain.authservice.auth;

public interface TokenService {
    String generateToken(String clientId);
}

