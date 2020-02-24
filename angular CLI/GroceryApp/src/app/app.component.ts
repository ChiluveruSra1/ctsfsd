import { Component } from '@angular/core';
import { Observable, Subscription, interval } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'GroceryApp';
  /* private updateSubscription: Subscription;

  constructor() {
      this.updateSubscription = interval(1000).subscribe(
        (val) => { this.updateStats()
      }
  );

} */
}
