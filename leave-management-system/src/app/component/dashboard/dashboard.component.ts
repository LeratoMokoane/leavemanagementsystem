import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, FormControl, FormsModule } from '@angular/forms';
import { EmployeeLeave } from '../../model/employee-leave';
import { LeaveService } from '../../service/leave.service';
import { LeaveType } from '../../model/leave-type';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})

export class DashboardComponent implements OnInit {

  leaveDetail!: FormGroup;
  empLeaveObj: EmployeeLeave = new EmployeeLeave();
  empLeaveList: EmployeeLeave[] = [];
  leaveTypeList: LeaveType[] = [];
  selectedValue!: string;

  constructor(private formBuilder: FormBuilder, private leaveService: LeaveService) { }

  ngOnInit(): void {

    this.getLeaveRequests();

    this.leaveDetail = this.formBuilder.group({
      id: [''],
      firstName: [''],
      lastName: [''],
      typeOfLeave: [''],
      reason: [''],
      leaveTaken: [''],
      leaveRemaining: [''],
      dateFrom: [''],
      dateTo: ['']
    });
  }

  addLeave() {
    console.log(this.leaveDetail);
    this.empLeaveObj.id = this.leaveDetail.value.id;
    this.empLeaveObj.firstName = this.leaveDetail.value.firstName;
    this.empLeaveObj.lastName = this.leaveDetail.value.lastName;
    this.empLeaveObj.reason = this.leaveDetail.value.reason;
    this.empLeaveObj.typeOfLeave = this.leaveDetail.value.typeOfLeave;
    this.empLeaveObj.leaveRemaining = this.leaveDetail.value.leaveRemaining;
    this.empLeaveObj.leaveTaken = this.leaveDetail.value.leaveTaken;
    this.empLeaveObj.dateFrom = this.leaveDetail.value.dateFrom;
    this.empLeaveObj.dateTo = this.leaveDetail.value.dateTo;


    this.leaveService.addLeave(this.empLeaveObj).subscribe(res => {
      console.log(res);
      this.getLeaveRequests();
    }, err => {
      console.log(err);
    });
  }

  getLeaveRequests() {
    this.leaveService.getLeaveRequests().subscribe(res => {
      this.empLeaveList = res;
    }, err => {
      console.log("Error while retriving leave request data");
    });
  }

  getLeaveTypes() {
    this.leaveService.getLeaveTypes().subscribe(res => {
      this.leaveTypeList = res;
    }, err => {
      console.log("Error while retriving leave type data");
    });
  }

}
