package org.woven.springdemo.springdemo.entities;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthRequest {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
}
