import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './home/home.component';
import {LoginComponent} from './login/login.component';
import {SignUpComponent} from './sign-up/sign-up.component';
import {TrainerComponent} from './trainer/trainer.component';
import {TraineeComponent} from './trainee/trainee.component';
import {AboutUsComponent} from './about-us/about-us.component';
import {ContactUsComponent} from './contact-us/contact-us.component';

const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'login',component:LoginComponent},
  {path:'signup',component:SignUpComponent},
  {path:'trainer',component:TrainerComponent},
  {path:'trainee',component:TraineeComponent},
  {path:'aboutus',component:AboutUsComponent},
  {path:'contactUs',component:ContactUsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
