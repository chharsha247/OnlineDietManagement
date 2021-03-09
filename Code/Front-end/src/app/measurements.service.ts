import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class MeasurementsService {
  baseUrl="http://localhost:8080/"
  constructor(private httpClient:HttpClient) { }

  public addMeasurement(measurement):Observable<any>{
    return this.httpClient.post(this.baseUrl+"addMeasurements",measurement,{responseType:'text' as 'json'});
  }

  public monthlyMeasures():Observable<any>{
    return this.httpClient.get(this.baseUrl+"monthlyMeasures");
  }
}
