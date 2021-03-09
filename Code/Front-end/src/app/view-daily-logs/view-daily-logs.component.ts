import { Component, OnInit } from '@angular/core';
import { DailylogService } from '../dailylog.service';

@Component({
  selector: 'app-view-daily-logs',
  templateUrl: './view-daily-logs.component.html',
  styleUrls: ['./view-daily-logs.component.css']
})
export class ViewDailyLogsComponent implements OnInit {
  dailyLogs:any;
  uType:string;
  constructor(private dailyLogService:DailylogService) { }

  ngOnInit(): void {
    this.uType=localStorage.getItem('uType');
    this.dailyLogService.getAllDailylogs().subscribe((data)=>{
      this.dailyLogs=data;
    });
  }

}
