import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import { UserService } from '../user.service';
import { CredentialsService } from '../credentials.service';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {
  user:any;
  userId:string;
  message:any;
  mail:string;
  medconOptions:string[]=['Healthy','Ill'];
  genderOptions: string[] = ['Male', 'Female'];
  pregOptions: string[] = ['Yes', 'No'];
  dietCustOptions:string[]=['Veg','Non-Veg','Vegan']
  //display:boolean=false;  
  constructor(private userService:UserService,private activatedRouter:ActivatedRoute,private credService:CredentialsService) { }

  ngOnInit(): void {
    this.mail=localStorage.getItem('mail');
    this.userId=this.activatedRouter.snapshot.paramMap.get("userId");
    this.getUserById(this.userId);
  }
  getUserById(userId){
    this.userService.getUserByUserId(userId).subscribe((data)=>{
    
      this.user=data;
    });
  }
  onSubmit(){
    this.updateUser(this.userId,this.user);
  }
  public updateUser(userId,user) {
    this.userService.updateUser(userId,user).subscribe(data => this.message=data, error => console.log(error));
  } 
}
