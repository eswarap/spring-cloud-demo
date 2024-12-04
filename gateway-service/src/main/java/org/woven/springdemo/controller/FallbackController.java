package org.woven.springdemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class FallbackController {

    @GetMapping("/fallback1")
    public String userFallback() {
        return "User service is not available";
    }

    @GetMapping("/auth-fallback")
    public String authFallback() {
        return "Auth service is not available";
    }
}
