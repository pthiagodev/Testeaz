import { Component } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';

import { Unidade } from './model/Unidade';

@Component({
  selector: 'app-unidades',
  standalone: true,
  imports: [MatCardModule, MatTableModule, MatToolbarModule],
  templateUrl: './unidades.component.html',
  styleUrl: './unidades.component.css'
})

export class UnidadesComponent {
  unidades: Unidade [] = [
    {_id: "1", nome: "Livro Clean Code"},
    {_id: "2", nome: "Livro Angular 17"},
    {_id: "3", nome: "Livro Spring Boot 3"}
  ];
  displayedColumns = ['numero', 'nome'];
}
