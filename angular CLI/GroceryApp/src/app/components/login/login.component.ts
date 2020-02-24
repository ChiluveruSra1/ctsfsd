import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  //email=""

  public myGroup:FormGroup

  constructor(private fb:FormBuilder) { }

  ngOnInit(): void {
    /* this.myGroup = new FormGroup({
      email: new FormControl(),
      password: new FormControl()
      
   }); */
   this.createForm()
  }

  createForm(){
    this.myGroup=this.fb.group({
      'name':[null,[Validators.required,Validators.pattern]],
      'email':[null,[Validators.required,Validators.pattern]],
      'password':[null,[Validators.required,,Validators.minLength(3),Validators.maxLength(12)]]
    });
  }


  //@Output()
  //childEvent=new EventEmitter;

  onLogin(data){
    console.log(data)
    localStorage.login=JSON.stringify(data)
    //this.childEvent.emit()
    //this.=JSON.parse(localStorage.login)

    //var login={ }

    //if(localStorage.login==undefined){
      
      //login.push(data)
     
    
      /* var datas=JSON.parse(localStorage.login)
      datas.push(data)
      localStorage.login=JSON.stringify(datas) */
    //}


  } 

  loadData(event){
    event.preventDefault();
    this.myGroup.setValue({
      name:'Sra1',
      email:'sra1@mail.com',
      password:'123456'
    })
  }

 

}
