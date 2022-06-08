package com.leratomokoane.spring_leave_app.repository;

import com.leratomokoane.spring_leave_app.model.LeaveType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveTypeRepository extends JpaRepository<LeaveType, Integer> {

}
