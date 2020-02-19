import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { DataService } from 'src/app/service/data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  _imgUrl="http://rjtmobile.com/grocery/images/"  
  catogeries:any;

  constructor(private dataService:DataService,
    private router:Router) {
   }

  ngOnInit(): void {
    this.dataService.getCategory().subscribe(
      c=>this.catogeries=c.data
    )
  }

  onSelectCat(c){
    this.router.navigate(['/products',c.catId])
  }




}
