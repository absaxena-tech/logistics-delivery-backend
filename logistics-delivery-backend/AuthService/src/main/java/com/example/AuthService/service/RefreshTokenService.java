package com.example.AuthService.service;

import com.example.AuthService.model.RefreshToken;
import com.example.AuthService.model.User;
import com.example.AuthService.repository.RefreshTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RefreshTokenService {

    private final RefreshTokenRepository repository;

    public String createRefreshToken(User user){

        RefreshToken token = RefreshToken.builder()
                .token(UUID.randomUUID().toString())
                .user(user)
                .expiryDate(Instant.now().plusSeconds(86400))
                .build();

        repository.save(token);

        return token.getToken();
    }

}
