import { Component, OnInit } from '@angular/core';
import { DailylogService } from '../dailylog.service';
import { Dailylog } from '../dailylog';

@Component({
  selector: 'app-dailylog',
  templateUrl: './dailylog.component.html',
  styleUrls: ['./dailylog.component.css']
})
export class DailylogComponent implements OnInit {
  breakfast:string;
  lunch:string;
  dinner:string;
  fruits:string;
  vegetables:string;
  workout:string;
  date:string;
  dailylog:Dailylog=new Dailylog();
  success:any;
  constructor(private dailylogService:DailylogService) { }

  ngOnInit(): void {
    this.date=String(new Date().getDate())+"/"+String(new Date().getMonth()+1)+"/"+String(new Date().getFullYear());
  }
  public submit(){
    this.dailylog.breakfast=this.breakfast;
    this.dailylog.lunch=this.lunch;
    this.dailylog.dinner=this.dinner;
    this.dailylog.fruits=this.fruits;
    this.dailylog.vegetables=this.vegetables;
    this.dailylog.workout=this.workout;
    this.dailylog.email=localStorage.getItem('mail');
    this.dailylog.date=this.date;
    this.submitDailylog(this.dailylog);

  }
  public submitDailylog(dailylog){
    this.dailylogService.addDailylog(dailylog).subscribe((data)=>this.success=data);
  }

}
