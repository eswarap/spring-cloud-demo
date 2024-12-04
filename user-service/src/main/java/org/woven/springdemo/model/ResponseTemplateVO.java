package org.woven.springdemo.model;

import lombok.*;
import org.woven.springdemo.entities.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseTemplateVO {

    private User user;
    private Department department;
}
