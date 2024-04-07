import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import { AppMaterialModule } from './shared/app-material/app-material.module';
import { UnidadesComponent } from './unidades/unidades.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [AppMaterialModule, RouterOutlet, UnidadesComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'leilao-app';
}
