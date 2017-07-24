import { Component, OnInit } from '@angular/core';

import { Team } from '../team';
import { TeamService } from '../team.service';

@Component({
  selector: 'app-list-team',
  providers: [TeamService],
  templateUrl: './list-team.component.html',
  styleUrls: ['./list-team.component.css']
})
export class ListTeamComponent implements OnInit {

  public teams: Team[];

  constructor(private service: TeamService) { }

  ngOnInit() {
    this.service.getTeams().then(teams => this.teams = teams);
  }

}
