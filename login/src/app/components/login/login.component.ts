import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Employee } from 'src/app/employee';
import { EmployeeService } from 'src/app/employee.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private employeeService: EmployeeService) { }

  ngOnInit(): void {
  }

  // public onAddEmployee(addForm: NgForm): void
  // {
  //   const objeto: Employee = {
  //     id: 30,
  //     nome: addForm.value.nome,
  //     senha: addForm.value.senha
  //   }
  //   this.employeeService.addEmployee(objeto).subscribe(
  //     (response: Employee) => {
  //       console.log(response);
  //     },
  //     (error: HttpErrorResponse) => {
  //       alert(error.message);
  //     }
  //   )
  // }




}
