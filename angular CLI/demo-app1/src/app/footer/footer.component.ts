import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';


@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css'],
  providers: [EmployeeService]
})
export class FooterComponent implements OnInit {

  employees=[];
  name=""

  constructor(private dataService:EmployeeService){
    this.dataService.getEmployees().subscribe(
      data => this.employees=data
    )
  }
  ngOnInit(): void {
  }

}
