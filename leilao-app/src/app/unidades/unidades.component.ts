import { Component } from '@angular/core';

import { AppMaterialModule } from '../shared/app-material/app-material.module';
import { Unidade } from './model/Unidade';


@Component({
  selector: 'app-unidades',
  standalone: true,
  imports: [AppMaterialModule],
  templateUrl: './unidades.component.html',
  styleUrl: './unidades.component.css'
})

export class UnidadesComponent {
  unidades: Unidade[] = [
    {_id: "1", nome: "Livro Clean Code", criadoEm: "07/04/2024 - 16:38:00", atualizadoEm: "07/04/2024 - 16:38:00"},
    {_id: "2", nome: "Livro Angular 17", criadoEm: "07/04/2024 - 16:38:00", atualizadoEm: "07/04/2024 - 16:38:00"},
    {_id: "3", nome: "Livro Spring Boot 3", criadoEm: "07/04/2024 - 16:38:00", atualizadoEm: "07/04/2024 - 16:38:00"}
  ];
  displayedColumns = ['numero', 'nome', 'criadoEm', 'atualizadoEm'];
}
