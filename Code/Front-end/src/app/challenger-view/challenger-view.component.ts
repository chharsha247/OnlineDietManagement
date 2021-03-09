import { Component, OnInit } from '@angular/core';
import { MessagesService } from '../messages.service';
import { UserService } from '../user.service';
import { User } from '../user';
@Component({
  selector: 'app-challenger-view',
  templateUrl: './challenger-view.component.html',
  styleUrls: ['./challenger-view.component.css']
})
export class ChallengerViewComponent implements OnInit {
  mail:string;
  name:string;
  user:any;
  constructor(private userService: UserService, private messagesService:MessagesService) { }

  ngOnInit(): void {
    this.mail=localStorage.getItem('mail');
    var email=this.mail;
    //this.userService.getUserByEmail(email).subscribe((data)=>this.user=(data));
    //console.log(email);
    //console.log(this.user);
    
    
  }

}