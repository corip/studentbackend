import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HomeService {
  private apiURL= 'http://pcori-webapp-d8awgpakc4c4a0ck.canadacentral-01.azurewebsites.net/student';
  constructor(private http: HttpClient) { }

  getStudents():Observable<Student[]>{
    return this.http.get<Student[]>(this.apiURL)
  }
}

export interface Student{
  id:number;
  name:string;
  lastName:string;
  age:number;
}
