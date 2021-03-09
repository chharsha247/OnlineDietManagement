import { Component, OnInit } from '@angular/core';
import {Router,ActivatedRoute} from '@angular/router';
import { UserService } from '../user.service';
@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  userId:string;
  user:any;
  emailStatus:any;
  message:string;
  constructor(private activatedRoute:ActivatedRoute,private userService:UserService,private router:Router) { }

  ngOnInit(): void {
    this.userId=this.activatedRoute.snapshot.paramMap.get("userId");
    this.getUserByUserId(this.userId);
  }
  public getUserByUserId(userId:string){
    this.userService.getUserByUserId(userId).subscribe((data)=>this.user=data);
  }
  gotoUsers(){
    this.router.navigate(["users-list"]);
  }
}
