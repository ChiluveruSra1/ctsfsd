import { NgModule } from '@angular/core'
import { RouterModule, Routes } from '@angular/router'
import { HomeComponent } from './components/home/home.component';
import { CartComponent } from './components/cart/cart.component';
import { ProductsComponent } from './components/products/products.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { SubCatComponent } from './components/sub-cat/sub-cat.component';

const routes:Routes=[
    {path:'home',component: HomeComponent},
    {path:'cart',component: CartComponent},
    {path:'products/:id',component: ProductsComponent},
    {path:'login',component: LoginComponent},
    {path:'register',component: RegisterComponent},
    {path:'subcat/:id',component:SubCatComponent}
    
];

@NgModule({
    imports:[ RouterModule.forRoot(routes) ],
    exports:[ RouterModule ]
})
export class AppRoutingModule{

}