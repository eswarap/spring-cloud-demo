package org.woven.springdemo.services;

import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.woven.springdemo.entities.*;
import org.woven.springdemo.repos.*;

@Service
@Slf4j
public class DepartmentService {

    private final DepartmentRepository repository;

    @Autowired
    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

    public Department save(Department department) {
        return this.repository.save(department);
    }

    public Department getById(long id) {
        return this.repository.findById(id)
                .orElse(null);
    }
}
