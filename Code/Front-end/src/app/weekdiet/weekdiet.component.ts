import { Component, OnInit } from '@angular/core';
import { HttpEventType, HttpResponse,HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { UploadFileService } from '../upload-file.service';
import { UserService } from '../user.service';
@Component({
  selector: 'app-weekdiet',
  templateUrl: './weekdiet.component.html',
  styleUrls: ['./weekdiet.component.css']
})
export class WeekdietComponent implements OnInit {
  public userfile:any=File;
  sendTo:string;
  message:string;
  uType:string;
  email:string;
  files:Observable<string[]>;
  user:any;
  showMessage:boolean=false;
  constructor(private fileService:UploadFileService,private userService:UserService) { }

  ngOnInit(): void {
    this.uType=localStorage.getItem('uType');
    this.email=localStorage.getItem('mail');
  }

  public onFileChanged(event){
    //select file
    const file=event.target.files[0];
    this.userfile=file;
  }
  public upload(){
    const formData = new FormData();
    formData.append('sendTo',this.sendTo);
    formData.append('file',this.userfile);
    this.showMessage=true;
    this.fileService.uploadFile(formData).subscribe((response)=>{
      
    });
    this.message="Diet Plan Updated Successfully";
  }

  show(){
    this.files=this.fileService.getFiles();
    
  }
  showByBatch(){
    this.userService.getUserByEmail(this.email).subscribe((data)=>{
      console.log(data);
      this.user=data;
      console.log(this.user.batch_id);
      this.files=this.fileService.getFilesByBatch(this.user.batch_id);
    });
    // console.log(this.user);
    // console.log(this.user.batch_id);
    
  }
}
