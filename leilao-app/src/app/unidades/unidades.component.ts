import { Component } from '@angular/core';
import { MatTableModule } from '@angular/material/table';

@Component({
  selector: 'app-unidades',
  standalone: true,
  imports: [MatTableModule],
  templateUrl: './unidades.component.html',
  styleUrl: './unidades.component.css'
})

export class UnidadesComponent {
  unidades: any[] = [];
}
