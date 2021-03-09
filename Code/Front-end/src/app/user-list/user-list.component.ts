import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import {Router} from '@angular/router';
import { User } from '../user';
@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  search:string;
  users:any;
  ubId:string;
  user:any;
  showAll:boolean=false;
  searchUser:boolean=false;
  searchBatch:boolean=false;
  constructor(private userService:UserService,private router:Router) { 
  }
  ngOnInit(): void {  
    
    console.log(localStorage.getItem('mail'));
  }
  searching(){
    if(this.search=='UserId'){
      //1 user ki
      this.userService.getUserByUserId(this.ubId).subscribe((data)=>this.user=data);
      this.searchUser=true;
      this.searchBatch=false;
      this.showAll=false;

    }
    else{
      //batch ki
      this.userService.getUsersByBatchId(this.ubId).subscribe((data)=>this.users=data);
      
      this.searchBatch=true;
      this.searchUser=false;
      this.showAll=false;
    }
  }
  public showall(){
    //andarikiok ga?
    this.userService.getAllUsers().subscribe((data)=>this.users=data);
    this.showAll=true;
    this.searchUser=false;
    this.searchBatch=false;
  }
  deleteUser(userId:string){
    this.userService.deleteUser(userId).subscribe((data)=>console.log(data));
    location.reload();
  }
}