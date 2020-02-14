import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';

//import { AppComponent } from './app.component';
import { TestComponent } from './test.component';
import { TestComp2Component } from './test-comp2/test-comp2.component';

@NgModule({
  declarations: [
   //AppComponent,
   TestComponent,
   TestComp2Component
  
  ],
  imports: [
    BrowserModule,
  ],
  providers: [],
  //bootstrap: [AppComponent],
  //bootstrap: [TestComponent],
  bootstrap: [TestComp2Component]
})
export class AppModule { }
