import { Component,OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  userType:string;
  title = 'front';
  profileVisible:boolean=false;
  ngOnInit(): void {
    this.userType=localStorage.getItem('uType');
  }
  public DemoCtrl() {
    if(this.userType==='admin'){
      this.profileVisible = true;
    }
  }
}
