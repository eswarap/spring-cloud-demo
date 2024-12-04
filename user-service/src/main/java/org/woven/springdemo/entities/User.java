package org.woven.springdemo.entities;

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.ser.std.*;
import lombok.*;
import org.bson.types.*;
import org.springframework.data.mongodb.core.mapping.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(collection = "users")
public class User {


    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;
    private String firstName;
    private String lastName;
    private String email;
    private String departmentId;
    private String password;
    private String role;

}
