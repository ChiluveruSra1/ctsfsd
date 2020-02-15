import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
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

/* employees=[];

constructor(){
this.employees=[
  {"empId":1,"empName":"Chiluveru","empAge":23},
  {"empId":2,"empName":"Sravan","empAge":22},
  {"empId":3,"empName":"Kumar","empAge":25}
]} */

employees=[
  {"empId":1,"empName":"Chiluveru","empAge":23},
  {"empId":2,"empName":"Sravan","empAge":22},
  {"empId":3,"empName":"Kumar","empAge":25}
]

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

}

