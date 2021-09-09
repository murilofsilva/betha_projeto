import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Employee } from 'src/app/employee';
import { EmployeeService } from 'src/app/employee.service';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {
  addressList:Number[]=[]
  telefoneList:Number[]=[0]
  // constructor(private employeeService: EmployeeService) { }
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }
  addNewAddress(): void{
    this.addressList.push(this.addressList.length)
  }
  addNewTelefone(): void{
    this.telefoneList.push(this.telefoneList.length)
  }
  public addTelefone(id_user:Number, addForm: NgForm){
    for(let i=0; i<this.telefoneList.length; i++){
    console.log(addForm.value[`telefone${i}`])
    this.http.post("http://localhost:8080/telefone/registro", 
    {numero:addForm.value[`telefone${i}`],
    id_user:id_user}).toPromise().then((data: any) =>{
      console.log(data)
    })
  }
}
  public addEndereco(id_user:Number, addForm: NgForm){
      for(let i=0; i<this.addressList.length; i++){
      console.log(addForm.value[`endereco${i}`])
      this.http.post("http://localhost:8080/endereco/registro", 
      {dados:addForm.value[`endereco${i}`],
      id_user:id_user}).toPromise().then((data: any) =>{
        console.log(data)
      })
    }
  }
  public onAddEmployee(addForm: NgForm): void
  {
    let id_user 
    console.log(addForm.value);
    
    this.http.post("http://localhost:8080/employee/registro", {
      nome: addForm.value.nome,
      senha: addForm.value.password,
      cpf: addForm.value.cpf,
      endereco_principal: addForm.value.endereco_principal
    }).toPromise().then((data: any) =>{
      console.log(data)
      id_user = data.id;
      this.addEndereco(id_user, addForm)
      this.addTelefone(id_user, addForm);
    })
    // const neymar: Employee =
    // {
    //   nome: addForm.value.nome,
    //   senha: addForm.value.senha
    // }
    // this.employeeService.addEmployee(neymar).subscribe(
    //   (response: Employee) => {
    //     console.log(response);
    //   },
    //   (error: HttpErrorResponse) => {
    //     alert(error.message);
    //   }
    // )
  }
}
