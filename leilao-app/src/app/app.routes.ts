import { Routes } from '@angular/router';

export const APP_ROUTES: Routes = [
  {
    path: 'unidades',
    loadChildren: () => import('./unidades/unidades.routes').then(u => u.UNIDADES_ROUTES) }
];
