import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
import { EmployeeLeave } from '../model/employee-leave';
import { LeaveType } from '../model/leave-type';

@Injectable({
  providedIn: 'root'
})
export class LeaveService {

  addEmpLeaveURL: string;
  getEmpLeaveURL: string;
  getLeaveTypeURL: string;

  constructor(private http : HttpClient) {
    this.addEmpLeaveURL = ' http://localhost:9091/leave/leaveRequest';
    this.getEmpLeaveURL = 'http://localhost:9091/leave/getLeaveRequests';
    this.getLeaveTypeURL = 'http://localhost:9091/leave/getLeaveTypes';
  }

  addLeave(empLeave : EmployeeLeave): Observable<EmployeeLeave> {
    return this.http.post<EmployeeLeave>(this.addEmpLeaveURL, empLeave);
  }

  getLeaveRequests(): Observable<EmployeeLeave[]> {
    return this.http.get<EmployeeLeave[]>(this.getEmpLeaveURL);
  }

  getLeaveTypes(): Observable<LeaveType[]> {
    return this.http.get<LeaveType[]>(this.getLeaveTypeURL);
  }
}
