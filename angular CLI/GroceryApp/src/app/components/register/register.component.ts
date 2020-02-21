import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user.model';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  category=["bakery","deserts","drinks"]
  registerForm;

  u=new User('','','','','',false)

  constructor() { }

  ngOnInit(): void {
  }

  onSubmitForm(){
    console.log(this.u)
  }

}
