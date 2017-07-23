import { TestBed, inject } from '@angular/core/testing';

import { AddTeamService } from './add-team.service';

describe('AddTeamService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AddTeamService]
    });
  });

  it('should be created', inject([AddTeamService], (service: AddTeamService) => {
    expect(service).toBeTruthy();
  }));
});
