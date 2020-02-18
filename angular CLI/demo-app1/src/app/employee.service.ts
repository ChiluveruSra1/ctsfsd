/* import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor() { }

  getEmployees(){
    return [
    {"empId":1,"empName":"Chiluveru","empAge":23,"empGender":"male", "empSal":50000, "empDoB":'12/09/1996'},
    {"empId":2,"empName":"Sravan","empAge":22,"empGender":"Male", "empSal":45000, "empDoB":'8/20/1996'},
    {"empId":3,"empName":"Kumar","empAge":25,"empGender":"male", "empSal":39000, "empDoB":'6/11/1996'},
    {"empId":4,"empName":"faraz","empAge":22,"empGender":"male", "empSal":39000, "empDoB":'8/4/1996'},
    {"empId":5,"empName":"alita","empAge":21,"empGender":"female", "empSal":42000, "empDoB":'2/11/1996'}
  ];
  }
} */

import { HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable()
export class EmployeeService{

  private _url:"../assets/empData.json"
  constructor(private http:HttpClient){}

  getEmployees():Observable<any[]>{
    return this.http.get<any[]>(this._url)
  }

}