import { Component, OnInit } from '@angular/core';

import { ProductsComponent } from '../products/products.component';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  public cart=[]
  public _imgUrl =  'http://rjtmobile.com/grocery/images/';

  constructor() { }

  ngOnInit(): void {
    this.cart=JSON.parse(localStorage.cart)
  }

  public total=0;

  totalPrice(amt){
    this.total+=amt;
  }

  mrp(){
    this.total
  } 

}
