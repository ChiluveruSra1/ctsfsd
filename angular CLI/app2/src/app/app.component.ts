import { Component } from '@angular/core';
import { EmployeeService } from './employee.service';
import { IEmployee } from './emp.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  title = 'app2';

  employees: IEmployee[];
  constructor(private empService:EmployeeService){
    this.empService.getEmployees().subscribe(
      data => this.employees=data
    )
  }
}
