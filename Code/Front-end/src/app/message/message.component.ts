import { Component, OnInit } from '@angular/core';
import { MessagesService } from '../messages.service';
import { Messages } from '../messages';
import { UserService } from '../user.service';

@Component({
  selector: 'app-message',
  templateUrl: './message.component.html',
  styleUrls: ['./message.component.css']
})
export class MessageComponent implements OnInit {
  messages:Messages=new Messages();
  message:string;
  sendto:string;
  buId:string;
  email:string;
  uType:string;
  sentMessages:any;
  sentSuccess:any;
  receivedMessages:any;
  viewMessage:boolean=false;
  recMessage:boolean=false;
  batch:any;
  batchMessages:any;
  constructor(private messagesService:MessagesService,private userService:UserService) { }

  ngOnInit(): void {
    this.uType=localStorage.getItem('uType');
    this.email=localStorage.getItem('mail');
    this.userService.getBatch(this.email).subscribe((data)=>{
      this.batch=data;
    });
  }
  public send(){
    this.messages.message=this.message;
    this.messages.send_to=this.sendto;
    this.messages.bu_id=this.buId;
    this.messages.send_from=localStorage.getItem('mail');
    this.sendMessage(this.messages);
  }

  sendMessage(messages){
    this.messagesService.addMessage(messages).subscribe((data)=>this.sentSuccess=data);
  }

  public viewSentMessages(){
    this.viewMessage=true;
    this.messagesService.getSentMessages(this.email).subscribe((data)=>this.sentMessages=(data));
  }
  receiveMessages(){
    this.recMessage=true;
    this.messagesService.getMessages(this.email).subscribe((data)=>this.receivedMessages=(data));
    this.messagesService.getessagesByBatch(this.batch).subscribe((data)=>this.batchMessages=data);
  }

}
