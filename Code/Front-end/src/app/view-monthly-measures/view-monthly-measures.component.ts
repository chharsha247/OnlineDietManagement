import { Component, OnInit } from '@angular/core';
import { MeasurementsService } from '../measurements.service';

@Component({
  selector: 'app-view-monthly-measures',
  templateUrl: './view-monthly-measures.component.html',
  styleUrls: ['./view-monthly-measures.component.css']
})
export class ViewMonthlyMeasuresComponent implements OnInit {
  measures:any;
  uType:string;
  constructor(private measurementsService:MeasurementsService) { }

  ngOnInit(): void {
    this.uType=localStorage.getItem('uType');
    this.measurementsService.monthlyMeasures().subscribe((data)=>{
      this.measures=data;
    });
  }



}
