import {Team} from './team';
import {Injectable} from '@angular/core';
import {Headers, Http} from '@angular/http';

import 'rxjs/add/operator/toPromise';

// TODO: Remove Mock
import { TEAMS } from './TeamMock';

@Injectable()
export class TeamService {

  private addTeamApiUrl = 'http://localhost:7070/api/team';
  private headers = new Headers({'Content-Type': 'application/json'});

  constructor(private http: Http) {}

  saveTeam(teamToSave: Team): Promise<Team> {
    return this.http
      .post(this.addTeamApiUrl, JSON.stringify(teamToSave), {headers: this.headers})
      .toPromise()
      .catch(this.handleError);

  }

  getTeams(): Promise<Team[]> {
    return Promise.resolve(TEAMS);
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  }

}
