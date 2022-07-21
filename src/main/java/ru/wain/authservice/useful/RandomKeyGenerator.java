package ru.wain.authservice.useful;

import java.math.BigInteger;
import java.security.SecureRandom;

/*
Класс генерации случайного ключа
не используется в проекте напрямую, сгененрированный ключ вносится в application.properties
*/
public class RandomKeyGenerator {

    public static void main(String[] args) {
        byte[] bytes = new byte[32];
        new SecureRandom().nextBytes(bytes);
        String secretKey = new BigInteger(1, bytes).toString(16);
        System.out.println(secretKey);
    }
}
