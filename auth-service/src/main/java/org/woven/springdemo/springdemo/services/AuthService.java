package org.woven.springdemo.springdemo.services;

import org.springframework.beans.factory.annotation.*;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.stereotype.*;
import org.springframework.util.*;
import org.springframework.web.client.*;
import org.woven.springdemo.springdemo.entities.*;
import org.woven.springdemo.springdemo.model.*;

@Service
public class AuthService {

    private final RestTemplate restTemplate;
    private final JwtUtil jwt;

    @Autowired
    public AuthService(RestTemplate restTemplate,
                       final JwtUtil jwt) {
        this.restTemplate = restTemplate;
        this.jwt = jwt;
    }

    public AuthResponse register(AuthRequest authRequest) {
        //do validation if user already exists
        authRequest.setPassword(BCrypt.hashpw(authRequest.getPassword(), BCrypt.gensalt()));

        UserVO userVO = restTemplate.postForObject("http://user-service/users", authRequest, UserVO.class);
        Assert.notNull(userVO, "Failed to register user. Please try again later");

        String accessToken = jwt.generate(userVO, "ACCESS");
        String refreshToken = jwt.generate(userVO, "REFRESH");

        return new AuthResponse(accessToken, refreshToken);

    }
}
