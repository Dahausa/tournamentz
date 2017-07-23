import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { HttpModule } from '@angular/http';

import { TournamentzMaterialModule} from './tournamentz-material-module/tournamentz-material-module.module';
import { AppComponent } from './app.component';
import { TeamComponent } from './team/team.component';
import { AddTeamComponent } from './team/add-team/add-team.component';


@NgModule({
  declarations: [
    AppComponent,
    TeamComponent,
    AddTeamComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    TournamentzMaterialModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
