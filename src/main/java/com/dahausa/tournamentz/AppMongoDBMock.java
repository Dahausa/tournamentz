package com.dahausa.tournamentz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dahausa.tournamentz.team.domain.Team;
import com.dahausa.tournamentz.team.domain.TeamRepository;

@Component
public class AppMongoDBMock  implements CommandLineRunner{
	
	@Autowired
	private TeamRepository teamRepository;

	@Override
	public void run(String... args) throws Exception {
		teamRepository.deleteAll();
		
		for(int i = 0; i < 10;i++) {
			Team team = Team.create("Team " + i);
			team.setContact("Contact " + i);
			teamRepository.save(team);
		}
	}

}
