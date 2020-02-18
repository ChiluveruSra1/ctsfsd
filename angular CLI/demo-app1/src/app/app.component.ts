import { Component } from '@angular/core';
import { EmployeeService } from './employee.service';


@Component({
  selector: 'app-root',
  //templateUrl: './app.component.html',
 templateUrl: './app1.component.html'
})
export class AppComponent {
  title = 'demo-app1';
  l=18;
  h=20;
  
  getArea(){
     let area=Number(this.l)*Number(this.h);
     return area;
 }

 getPerimeter() {
     return 2*(Number(this.l)+Number(this.h));
 }

 isDisabled=false;
 imgPath="https://www.cognizant.com/content/dam/cognizant_foundation/Dotcomimage/COG-Logo-White.svg"
 imgName="cognizant-logo"

 onButtonClick(event){
   console.log(event)
 }


hasError="false"
markColor="yellow"
  
 area={
   "text-success": this.getArea()>300,
   "text-danger": this.getArea()<300
 }

 perimeter={
  "text-success": this.getPerimeter()>100,
  "text-danger": this.getPerimeter()<100
}

special={
  color:"coral",
  fontStyle:"Italic",
  fontWeight:"bold",
  fontSize:"40px"
}

isLogin=true;

choice1="five"
choice2=4
 
names=["Chiluveru","Sravan","Kumar"]

para1=false;
para2=false;

 employees=[];

 constructor(private dataService:EmployeeService){
   this.dataService.getEmployees().subscribe(
     data => this.employees=data
    )
 }

/*
constructor(){
this.employees=[
  {"empId":1,"empName":"Chiluveru","empAge":23},
  {"empId":2,"empName":"Sravan","empAge":22},
  {"empId":3,"empName":"Kumar","empAge":25}
]} */

/* employees=[
  {"empId":1,"empName":"Chiluveru","empAge":23,"empGender":"male", "empSal":50000, "empDoB":'12/09/1996'},
  {"empId":2,"empName":"Sravan","empAge":22,"empGender":"Male", "empSal":45000, "empDoB":'8/20/1996'},
  {"empId":3,"empName":"Kumar","empAge":25,"empGender":"male", "empSal":39000, "empDoB":'6/11/1996'},
  {"empId":4,"empName":"alita","empAge":21,"empGender":"female", "empSal":42000, "empDoB":'2/11/1996'}
] */

/* addData(){
  this.employees=[
    {"empId":1,"empName":"Chiluveru","empAge":23},
    {"empId":2,"empName":"Sravan","empAge":22},
    {"empId":3,"empName":"Kumar","empAge":25},
    {"empId":4,"empName":"faraz","empAge":23}
  ]} */

 /*  trackByEmpId(e,index)  {
    return e.empId
  } */


  name1="Chilu";
  msg="";

}

