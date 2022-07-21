package ru.wain.authservice.auth;

import lombok.Data;
import lombok.Value;

@Data
public class User {
    String clientId;
    String clientSecret;
}
