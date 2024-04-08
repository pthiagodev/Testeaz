import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { Unidade } from '../model/Unidade';

@Injectable({
  providedIn: 'root'
})
export class UnidadesService {

  private readonly API = "api/unidade";

  constructor(private httpClient: HttpClient) { }

  listar() {
    return this.httpClient.get<Unidade[]>(this.API);
  }
}
