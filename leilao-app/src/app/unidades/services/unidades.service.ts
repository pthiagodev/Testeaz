import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Unidade } from '../model/Unidade';

@Injectable({
  providedIn: 'root'
})
export class UnidadesService {

  private readonly API = "localhost:8080";

  constructor(private httpClient: HttpClient) { }

  listar() {
    return this.httpClient.get<Unidade[]>(this.API + "/unidade");
  }
}
