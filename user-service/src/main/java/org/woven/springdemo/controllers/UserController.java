package org.woven.springdemo.controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.woven.springdemo.entities.*;
import org.woven.springdemo.model.*;
import org.woven.springdemo.services.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping
    public ResponseTemplateVO getUser(
            @RequestHeader(value = "id") String userId,
            @RequestHeader(value = "role") String role) {
        return userService.getUserWithDepartment(userId);
    }

    @GetMapping(value = "/secure")
    public String getSecure() {
        return "Secure endpoint available";
    }
}
