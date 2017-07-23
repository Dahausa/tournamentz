import { AddTeamComponent } from './add-team/add-team.component';
import { Component, OnInit } from '@angular/core';
import { Team } from './team';

@Component({
  selector: 'app-team',
  templateUrl: './team.component.html',
  styleUrls: ['./team.component.css']
})
export class TeamComponent implements OnInit {

  componentTitle = 'Team management';

  team: Team;

  constructor() { }

  ngOnInit() {
    this.team = new Team();
  }

}
