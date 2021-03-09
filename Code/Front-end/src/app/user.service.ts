import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Router} from '@angular/router';
import { from, Observable } from 'rxjs';
import { User } from './user';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  baseUrl="http://localhost:8080/"
  constructor(private httpClient:HttpClient,private router:Router) { }
  
  //retrieving all users
  public getAllUsers(){
    if(localStorage.getItem('isLoggedIn')=='true'){
      return this.httpClient.get(this.baseUrl+"users");
    }
    else{
      this.router.navigate(['login']);
    }
    
  }

  //retrieving user by email for login
  public getUserByEmail(email):Observable<any>{
    return this.httpClient.get(this.baseUrl+"users/"+email);
  }

  //retrieving unapproved users 
  public getUsersByApprovalStatus(){
    return this.httpClient.get(this.baseUrl+"users/byApprovalStatus");
  }

  //retrieving new Users
  public getUsersByNewUser(){
    return this.httpClient.get(this.baseUrl+"byNewUser");
  }

  //retrieving user by userId
  public getUserByUserId(userId){
    return this.httpClient.get(this.baseUrl+"userbyUserId/"+userId);
  }
  
  //retrieve user by BatchId
  public getUsersByBatchId(batchId){
    return this.httpClient.get(this.baseUrl+"usersByBatchId/"+batchId);
  }

  //sending Email
  public sendAcceptEmail(email){
    return this.httpClient.get(this.baseUrl+"sendAcceptMail/"+email,{responseType:'text' as 'json'});
  }
  public sendRejectEmail(email){
    return this.httpClient.get(this.baseUrl+"sendRejectMail/"+email,{responseType:'text' as 'json'});
  }
  //add User
  public addingUser(user){
    return this.httpClient.post(this.baseUrl+"addUser",user,{responseType:'text' as 'json'});
  }

  //Updating User
  public updateUser(userId,user){
    return this.httpClient.put(this.baseUrl+"updateUser/"+userId,user,{responseType:'text' as 'json'});
  }

  //Deleting User
  public deleteUser(userId){
    return this.httpClient.delete(this.baseUrl+"deleteUser/"+userId,{responseType:'text' as 'json'});
  }

  //Get Yes or no based on referral code
  public getRefValid(referralCode):Observable<any>{
    return this.httpClient.get(this.baseUrl+"userByReference/"+referralCode,{responseType:'text' as 'json'});
  }
  //Get Batch name
  public getBatch(email){
    return this.httpClient.get(this.baseUrl+"batchId/"+email,{responseType:"text" as "json"});
  }
}

