package com.leratomokoane.spring_leave_app.services;

import com.leratomokoane.spring_leave_app.model.EmployeeLeave;
import com.leratomokoane.spring_leave_app.repository.EmployeeLeaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeLeaveService {
    @Autowired
    private EmployeeLeaveRepository employeeLeaveRepository;

    public EmployeeLeave submitLeave(EmployeeLeave employeeLeave) {
        return employeeLeaveRepository.save(employeeLeave);
    }

    public List<EmployeeLeave> getAllRequests() {
        //validator
        return employeeLeaveRepository.findAll();
    }
}
