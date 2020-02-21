import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public myGroup:FormGroup

  constructor(private fb:FormBuilder) { }

  ngOnInit(): void {
  }

  createForm(){
    this.myGroup=this.fb.group({
      'email':[null,Validators.required],
      'password':[null,Validators.required]
    });
  }

  onLogin(data){
    console.log(data)
  }

}
