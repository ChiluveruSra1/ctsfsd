import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-sub-cat',
  templateUrl: './sub-cat.component.html',
  styleUrls: ['./sub-cat.component.css']
})
export class SubCatComponent implements OnInit {
  
  
_imgUrl="http://rjtmobile.com/grocery/images/"  

  subCat=[]

  constructor(private dataService:DataService) {
    this.dataService.getSubCategory(1).subscribe(
      sc=>this.subCat=sc.data
    )
   }

  ngOnInit(): void {
  }

  @Output()
  childEvent=new EventEmitter;

  onButtonClick(){
    this.childEvent.emit(this.subCat);
  }

}
