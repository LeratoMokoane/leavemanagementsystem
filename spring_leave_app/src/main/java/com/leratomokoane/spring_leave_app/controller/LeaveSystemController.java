package com.leratomokoane.spring_leave_app.controller;

import com.leratomokoane.spring_leave_app.model.EmployeeLeave;
import com.leratomokoane.spring_leave_app.model.LeaveType;
import com.leratomokoane.spring_leave_app.services.EmployeeLeaveService;
import com.leratomokoane.spring_leave_app.services.LeaveTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leave")
public class LeaveSystemController {

    @Autowired
    private EmployeeLeaveService employeeLeaveService;

    @Autowired
    private LeaveTypeService leaveTypeService;

    //Submit leave request
    @CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
    @RequestMapping(path = "/leaveRequest")
    public EmployeeLeave leaveRequest(@RequestBody EmployeeLeave employeeLeave) {
       return employeeLeaveService.submitLeave(employeeLeave);
    }

    //Retrieve leave requests
    @CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
    @RequestMapping("/getLeaveRequests")// add '/{parameter}' to mapping to pass parameters
    public List<EmployeeLeave> getLeaveRequests(){// when passing a variable, use @PathVariable in parameter declaration
        return employeeLeaveService.getAllRequests();
    }

    //Retrieve leave types
    @CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
    @GetMapping("/getLeaveTypes")
    public List<LeaveType> getLeaveTypes(){
        List<LeaveType> list = leaveTypeService.getLeaveTypes();
        return list;
    }

}
