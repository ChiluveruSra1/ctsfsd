import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/service/data.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  public catId;
  public subCategory: any;
  public products: any;
  public _imgUrl =  'http://rjtmobile.com/grocery/images/';

  constructor(private dataService: DataService, private activedRoute: ActivatedRoute){
    this.catId=activedRoute.snapshot.paramMap.get('id')
  }
    

  

  ngOnInit(): void {
    this.dataService.getSubCategory(this.catId).subscribe(
      x => this.subCategory = x.data
    )

    this.dataService.getProducts(1).subscribe(
      x => this.products = x.data
    )
  }

  addToCart(p){
    var item={
      name:p.productName,
      unit:p.unit,
      mrp:p.mrp*71,
      image:p.image
    }

    if(localStorage.cart==undefined){
      var cartItems=[];
      cartItems.push(item)
  
      localStorage.cart=JSON.stringify(cartItems)
    }
    else{
      
      var products=JSON.parse(localStorage.cart)
      products.push(item)
      localStorage.cart=JSON.stringify(products)
    }
  }

  onSelectSubCat(sc){
    this.dataService.getProducts(sc).subscribe(
      x => this.products = x.data
    )
  }


}