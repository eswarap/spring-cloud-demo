package org.woven.springdemo.repos;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;
import org.woven.springdemo.entities.*;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
