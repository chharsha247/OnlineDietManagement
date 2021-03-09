import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';
import { Credentials } from '../credentials';
import { CredentialsService } from '../credentials.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {
  message:any;
  count:number=1;
  userId: string;
	fullName: string;
	age: number;
	gender:string;
	mobileNumber:number;
	email:string;
	address:string;
	city:string;
	state:string;
	country:string;
	pinCode:number;
	height:number;
	weight:number;
	reasonForJoining:string;
	medicalConditions:string;
	dietaryRistrictions:string;
	dietaryCustom:string;
	pregnantStatus:string;
	referralCode:string;
	bmi:number;
  password:string;
  batchId:string;
  user:User=new User();
  cred:Credentials=new Credentials();
  display:boolean=false;  
  pregShow:boolean;
  showPreg:boolean=false;
  medconOptions:string[]=['Healthy','Ill'];
  genderOptions: string[] = ['Male', 'Female'];
  pregOptions: string[] = ['Yes', 'No'];
  dietCustOptions:string[]=['Veg','Non-Veg','Vegan']
  refValid:any;
  refValidError:boolean=false;
  constructor(private userService:UserService,private credentialsService:CredentialsService) { }
  
  
  ngOnInit(): void {
  }
  onSubmit(){
    //1
    this.user.userId=this.fullName.substring(0,6)+this.count++;
    //2
    this.user.address=this.address;
    //3
    this.user.age=this.age;
    //4
    this.user.bmi=Math.floor(this.weight/((this.height/100)*(this.height/100)));
    //5
    this.user.city=this.city;
    //6
    this.user.country=this.country;
    //7
    this.user.dietaryCustom=this.dietaryCustom;
    //8
    this.user.dietaryRistrictions=this.dietaryRistrictions;
    //9
    this.user.email=this.email;
    this.cred.email=this.email;
    //10
    this.user.fullName=this.fullName;
    //11
    this.user.gender=this.gender;
    //12
    this.user.height=this.height;
    //13
    this.user.medicalConditions=this.medicalConditions;
    //14
    this.user.mobileNumber=this.mobileNumber;
    //15
    this.cred.password=this.fullName.substring(0,4)+"@"+this.age+this.gender.substring(0,1);
    this.user.userReferenceCode="REF"+(this.count++)+this.fullName.substring(0, 3);
    //16
    this.user.pinCode=this.pinCode;
    //17
    this.user.pregnantStatus=this.pregnantStatus;
    //18
    this.user.reasonForJoining=this.reasonForJoining;
    //19
    this.user.referralCode=this.referralCode;
    //20
    this.user.state=this.state;
    //21
    this.user.weight=this.weight;
    this.user.approvalStatus="no";
    this.cred.userType="user";
    this.user.newUser="yes";
    this.batchId=String(this.weight/((this.height/100)*(this.height/100))>25);
    //console.log(this.batchId);
    if(this.batchId=="false"){
      this.user.batch_id="Batch1";
    }
    else{
      this.user.batch_id="Batch2";
    }
    
    /**
     * addUser
     */
    this.addUser();
  }
  public addUser() {
    this.userService.getRefValid(this.referralCode).subscribe((data)=>{
      this.refValid=data;
      console.log(this.refValid);
        if(String(this.refValid)=="yes"){
          console.log(this.refValid);
          this.userService.addingUser(this.user).subscribe((data)=>this.message=data);
          //console.log(this.message);
          this.credentialsService.addingUser(this.cred).subscribe((data)=>console.log(data));
          this.refValidError=false;
        }
        else{
          this.refValidError=true;
        }
    });
  } 
}
