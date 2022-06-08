package com.leratomokoane.spring_leave_app.services;

import com.leratomokoane.spring_leave_app.model.LeaveType;
import com.leratomokoane.spring_leave_app.repository.LeaveTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveTypeService {
    @Autowired
    private LeaveTypeRepository leaveTypeRepository;

    public List<LeaveType> getLeaveTypes() {
        return leaveTypeRepository.findAll();
    }
}
