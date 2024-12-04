package org.woven.springdemo.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {

    private long id;
    private String name;
    private String address;
    private String code;

}
