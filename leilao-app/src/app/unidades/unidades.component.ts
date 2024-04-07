import { Component } from '@angular/core';
import { Observable } from 'rxjs';

import { AppMaterialModule } from '../shared/app-material/app-material.module';
import { Unidade } from './model/Unidade';
import { UnidadesService } from './services/unidades.service';


@Component({
  selector: 'app-unidades',
  standalone: true,
  imports: [AppMaterialModule],
  templateUrl: './unidades.component.html',
  styleUrl: './unidades.component.css'
})

export class UnidadesComponent {
  unidades: Observable<Unidade[]>;
  displayedColumns = ['numero', 'nome', 'criadoEm', 'atualizadoEm'];

  constructor(private unidadesService: UnidadesService) {
    this.unidades = this.unidadesService.listar();
  }
}
