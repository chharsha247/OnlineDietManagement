import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { from } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class MessagesService {
  baseUrl="http://localhost:8080/";
  constructor(private httpClient:HttpClient) { }

  public addMessage(message){
    return this.httpClient.post(this.baseUrl+"addMessage",message,{responseType:"text" as "json"});
  }
  public getMessages(email){
    return this.httpClient.get(this.baseUrl+"getMessages/"+email);
  }
  public getSentMessages(email){
    return this.httpClient.get(this.baseUrl+"getSentMessages/"+email);
  }
  public getessagesByBatch(batch){
    return this.httpClient.get(this.baseUrl+"getMessagesByBatch/"+batch);
  }
}