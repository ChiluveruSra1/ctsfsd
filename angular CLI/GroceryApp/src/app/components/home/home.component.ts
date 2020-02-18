import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

_imgUrl="http://rjtmobile.com/grocery/images/"  
  catogeries:any;
  constructor(private dataService:DataService) {

   }
msg="sdg";
  ngOnInit(): void {
    this.dataService.getCategory().subscribe(
      c=>this.catogeries=c.data
    )
  }



}
