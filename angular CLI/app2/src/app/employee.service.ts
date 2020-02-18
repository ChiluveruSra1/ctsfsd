import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { IEmployee } from './emp.model';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  durl= "http://jsonplaceholder.typicode.com/posts"
  constructor(private http:HttpClient) { }

  getEmployees():Observable<IEmployee[]>{
    return this.http.get<IEmployee[]>(this.durl);
  }
}

