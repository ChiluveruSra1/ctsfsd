import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  constructor() { }
  name1="";

  @Input()
  parentData;

  @Input()
  parentData2;

  msg="data from child"
  @Output()
  childEvent=new EventEmitter;

  onButtonClick(){
    this.childEvent.emit(this.name1);
  }


  ngOnInit(): void {
  }

}
