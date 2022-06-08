package com.leratomokoane.spring_leave_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeLeave {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;
    private String lastName;
    private String leaveRequestReason;

    private int leaveTaken;
    private int leaveRemaining;
    private int leaveTypeId;

    private Date startDate;
    private Date endDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLeaveRequestReason() {
        return leaveRequestReason;
    }

    public void setLeaveRequestReason(String leaveRequestReason) {
        this.leaveRequestReason = leaveRequestReason;
    }

    public int getLeaveTaken() {
        return leaveTaken;
    }

    public void setLeaveTaken(int leaveTaken) {
        this.leaveTaken = leaveTaken;
    }

    public int getLeaveRemaining() {
        return leaveRemaining;
    }

    public void setLeaveRemaining(int leaveRemaining) {
        this.leaveRemaining = leaveRemaining;
    }

    public int getLeaveTypeId() {
        return leaveTypeId;
    }

    public void setLeaveTypeId(int leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
