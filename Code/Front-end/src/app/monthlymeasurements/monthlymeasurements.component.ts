import { Component, OnInit } from '@angular/core';
import { MeasurementsService } from '../measurements.service';
import { Measurements } from '../measurements';

@Component({
  selector: 'app-monthlymeasurements',
  templateUrl: './monthlymeasurements.component.html',
  styleUrls: ['./monthlymeasurements.component.css']
})
export class MonthlymeasurementsComponent implements OnInit {
  months:string[]=['January','February','March','April','May','June','July','August','September','October','November','December'];
  month:string;
  height:number;
  weight:number;
  chest:number;
  waist:number;
  shoulders:number;
  biceps:number;
  leg:number;
  thighs:number;
  email:string;
  success:any;
  measurement:Measurements=new Measurements();
  constructor(private measurementsService:MeasurementsService) { }

  ngOnInit(): void {
    let m=new Date().getMonth();
    this.month=this.months[m];
  }
  public submit(){

    this.measurement.email=localStorage.getItem('mail');
    this.measurement.height=this.height;
    this.measurement.weight=this.weight;
    this.measurement.chest=this.chest;
    this.measurement.waist=this.waist;
    this.measurement.shoulders=this.shoulders;
    this.measurement.biceps=this.biceps;
    this.measurement.leg=this.leg;
    this.measurement.thighs=this.thighs;
    this.measurement.month=this.month;
    this.submitMeasures(this.measurement);
    
  }
  public submitMeasures(measurement){
    this.measurementsService.addMeasurement(measurement).subscribe((data)=>this.success=data);
  }
}
