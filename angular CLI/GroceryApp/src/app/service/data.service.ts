import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  _basrUrl ="http://apolis-grocery.herokuapp.com/api/"
  _categoryUrl="category"
  _subCatUrl="subcategory/"
  _productUrl="products/"

  constructor(private http:HttpClient) { }

  getCategory():Observable<any>{
    return this.http.get<any>(`${this._basrUrl+this._categoryUrl}`)
  }

  getSubCategory(catId):Observable<any>{
    return this.http.get<any>(`${this._basrUrl+this._subCatUrl+catId}`)
  }

  getProducts(prodId):Observable<any>{
    return this.http.get<any>(`${this._basrUrl+this._productUrl+prodId}`)
  }

}
