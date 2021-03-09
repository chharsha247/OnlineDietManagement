import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import {Router} from '@angular/router';
import { User } from '../user';
import { CredentialsService } from '../credentials.service';
import { Credentials } from '../credentials';
@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {
  email:string;
  password:string;
  credentials:Credentials=new Credentials();
  resp:any;
  errorMsg:string;
  constructor(private credentialsService:CredentialsService,private router:Router) { }

  ngOnInit(): void {
  }

  public authenticate(){
    this.credentials.email=this.email;
    this.credentials.password=this.password;
    this.credentialsService.login(this.credentials).subscribe(
      (data)=>{
        console.log(data);
        this.resp=data;
        var splitted=String(this.resp).toString().split(" ",6);
        console.log(splitted);
        console.log(this.resp);
        if((splitted[0]=="true")&&(splitted[2]=="admin")){
          localStorage.setItem('isLoggedIn',splitted[0]);
          localStorage.setItem('mail',splitted[1]);
          localStorage.setItem('uType',splitted[2]);
          this.router.navigate(['admin-view']);
          console.log(localStorage);
          
        }
        else if((splitted[0]=="true")&&(splitted[2]=="motivator")){
          localStorage.setItem('isLoggedIn',splitted[0]);
          localStorage.setItem('mail',splitted[1]);
          localStorage.setItem('uType',splitted[2]);
          this.router.navigate(['motivator-view']);
          
        }
        else if((splitted[0]=="true")&&(splitted[2]=="user")){
          localStorage.setItem('isLoggedIn',splitted[0]);
          localStorage.setItem('mail',splitted[1]);
          localStorage.setItem('uType',splitted[2]);
          this.router.navigate(['challenger-view']);
          
        }
        else if((splitted[0]=="false")&&(splitted.length==6)){
          console.log(splitted[1]);
          this.errorMsg=splitted[1]+" "+splitted[2]+" "+splitted[3]+" "+splitted[4]+" "+splitted[5];
        }
        else if((splitted[0]=="false")&&(splitted.length==3))
        {
            console.log(splitted[1]);
            this.errorMsg=splitted[1]+" "+splitted[2];
        }
      }
    );
    
  }
}
