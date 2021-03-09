import { Injectable } from '@angular/core';
import { HttpClient, HttpRequest, HttpHeaders, HttpEvent } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UploadFileService {
  private baseUrl = 'http://localhost:8080/';

  constructor(private httpClient: HttpClient) { }
  //Uploading a file
  public uploadFile(formData:FormData):Observable<any>{
    return this.httpClient.post(this.baseUrl+'upload',formData);
  }

  //List of all files
  getFiles(): Observable<any> {
    return this.httpClient.get<any>(this.baseUrl+'getAll/files');
  }
  getFilesByBatch(batchId): Observable<any> {
    return this.httpClient.get<any>(this.baseUrl+'getAll/files/'+batchId);
  }
    
}

