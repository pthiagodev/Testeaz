import { Component } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatTableModule } from '@angular/material/table';

import { Unidade } from './model/Unidade';

@Component({
  selector: 'app-unidades',
  standalone: true,
  imports: [MatCardModule, MatTableModule],
  templateUrl: './unidades.component.html',
  styleUrl: './unidades.component.css'
})

export class UnidadesComponent {
  unidades: Unidade[] = [
    { _id: "1", nome: "Teste", criadoEm: "24/03/2024", atualizadoEm: "25/03/2024"}
  ];
  displayedColumns = ['_id', 'nome', 'criadoEm', 'atualizadoEm']
}
