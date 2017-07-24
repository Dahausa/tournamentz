import { Component, OnInit } from '@angular/core';
import { Team } from '../team';
import { TeamService } from '../team.service';

@Component({
  selector: 'app-add-team',
  providers: [TeamService],
  templateUrl: './add-team.component.html',
  styleUrls: ['./add-team.component.css']
})
export class AddTeamComponent implements OnInit {

  teamToAdd: Team;

  constructor(private service: TeamService) { }

  ngOnInit() {
    this.teamToAdd = new Team();
  }

  saveTeam(team: Team) {
    this.service.saveTeam(this.teamToAdd);
    this.teamToAdd = new Team();
    console.log('Team saved' + this.teamToAdd.name);
  }

}
