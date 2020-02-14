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

  
 area={
   "text-success": this.getArea()>300,
   "text-danger": this.getArea()<300
 }

 perimeter={
  "text-success": this.getPerimeter()>100,
  "text-danger": this.getPerimeter()<100
}
 

}

