package com.leratomokoane.spring_leave_app.repository;

import com.leratomokoane.spring_leave_app.model.EmployeeLeave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeLeaveRepository extends JpaRepository<EmployeeLeave, Integer> {

}
