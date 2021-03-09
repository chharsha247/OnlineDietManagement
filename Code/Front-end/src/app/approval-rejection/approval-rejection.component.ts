import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { ActivatedRoute} from '@angular/router';
@Component({
  selector: 'app-approval-rejection',
  templateUrl: './approval-rejection.component.html',
  styleUrls: ['./approval-rejection.component.css']
})
export class ApprovalRejectionComponent implements OnInit {
  users:any;
  constructor(private userService:UserService, private activatedRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.getUsersByNewUser();
  }
  public getUsersByNewUser(){
    this.userService.getUsersByNewUser().subscribe((data)=>this.users=data);
  }
}
