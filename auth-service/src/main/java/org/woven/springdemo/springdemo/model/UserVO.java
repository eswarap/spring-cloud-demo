package org.woven.springdemo.springdemo.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserVO {


    private String id;
    private String email;
    private String password;
    private String role;

}
