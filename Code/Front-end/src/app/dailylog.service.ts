import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { from } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class DailylogService {
  baseUrl="http://localhost:8080/";
  constructor(private httpClient:HttpClient) { }

  public addDailylog(dailylog){
    return this.httpClient.post(this.baseUrl+"addDailylog",dailylog,{responseType:"text" as "json"});
  }

  public getAllDailylogs(){
    return this.httpClient.get(this.baseUrl+"dailyLogs");
  }
}