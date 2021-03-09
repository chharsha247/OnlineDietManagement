import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-admin-view',
  templateUrl: './admin-view.component.html',
  styleUrls: ['./admin-view.component.css']
})
export class AdminViewComponent implements OnInit {
  users:any;
  user:string;
  constructor(private userService: UserService) { }

  
  ngOnInit(): void {
    this.getAllUsers();
    this.user=localStorage.getItem('uType');
  }
  public getAllUsers(){
    this.userService.getAllUsers().subscribe((data)=>this.users=data);
  }
  public edit(userId: string){
    
    
  }
}
