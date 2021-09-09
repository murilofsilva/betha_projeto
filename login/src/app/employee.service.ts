import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from './employee';
import { environment } from 'src/environments/environment';

@Injectable({providedIn: 'root'})
export class EmployeeService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient){}

  public getEmployee(employeeId: number): Observable<Employee> {
    return this.http.get<Employee>(`${this.apiServerUrl}/employee/find/${employeeId}`);
  }

  public addEmployee(employee: Employee): Observable<Employee> {
    const headers = new HttpHeaders().set('Content-Type', 'application/json');
    return this.http.post<Employee>(`${this.apiServerUrl}/employee/registro`, employee, {
      headers: headers
    });
  }
}