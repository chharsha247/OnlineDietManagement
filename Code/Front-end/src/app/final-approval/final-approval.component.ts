import { Component, OnInit } from '@angular/core';
import { ActivatedRoute,Router } from '@angular/router';
import { UserService } from '../user.service';
import { User } from '../user';
@Component({
  selector: 'app-final-approval',
  templateUrl: './final-approval.component.html',
  styleUrls: ['./final-approval.component.css']
})
export class FinalApprovalComponent implements OnInit {
  userId:string;
  user:any;
  emailStatus:any;
  userToUpdate:User= new User();
  message:string;
  constructor(private activatedRoute:ActivatedRoute,private router:Router,private userService:UserService) { }

  ngOnInit(): void {
    this.userId=this.activatedRoute.snapshot.paramMap.get("userId");
    this.getUserByUserId(this.userId);
    console.log(this.userId);
  }
  public getUserByUserId(userId:string){
    this.userService.getUserByUserId(userId).subscribe((data)=>this.user=data);
  }
  public approve(){
    console.log("Approved.");
    this.userService.sendAcceptEmail(this.user.email).subscribe((data)=>this.emailStatus=data);
    this.userToUpdate=this.user;
    this.userToUpdate.approvalStatus="yes";
    this.userToUpdate.newUser="no";
    this.updateUserApproved(this.userId,this.userToUpdate);
    this.message="Thank you for responding";
  }
  public reject(){
    console.log("Rejected.");
    this.userService.sendRejectEmail(this.user.email).subscribe((data)=>this.emailStatus=data);
    this.userToUpdate=this.user;
    this.userToUpdate.approvalStatus="no";
    this.userToUpdate.newUser="no";
    this.updateUserApproved(this.userId,this.userToUpdate);
    this.message="Thank you for responding";
  }
  /**
   * updateUserApproved
   */
  public updateUserApproved(userId,userToUpdate) {
    this.userService.updateUser(this.userId,this.userToUpdate).subscribe((data)=>console.log(data));
  }

  public back(){
    this.router.navigate(['approval-rejection']);
  }
}
