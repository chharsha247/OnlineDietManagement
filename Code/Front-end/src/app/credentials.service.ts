import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class CredentialsService {
  baseUrl='http://localhost:8080/';
  constructor(private httpClient:HttpClient) { }

  public login(credentials){
    return this.httpClient.post(this.baseUrl+'login',credentials,{responseType:'text' as 'json'});
  }
  public addingUser(credentials){
    return this.httpClient.post(this.baseUrl+"addCredentials",credentials,{responseType:'text' as 'json'});
  }
}
