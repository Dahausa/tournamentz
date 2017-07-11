package com.dahausa.tournamentz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dahausa.tournamentz.domain.team.Team;
import com.dahausa.tournamentz.domain.team.TeamContact;
import com.dahausa.tournamentz.domain.team.TeamRepository;

@Component
public class AppMongoDBMock  implements CommandLineRunner{
	
	@Autowired
	private TeamRepository teamRepository;

	@Override
	public void run(String... args) throws Exception {
		teamRepository.deleteAll();
		
		for(int i = 0; i < 10;i++) {
			TeamContact contact = TeamContact.create("Contact " + i, "mail"+i+"@mail.org");
			Team team = Team.create("Team " + i);
			team.setContact(contact);
			teamRepository.save(team);
		}
	}

}
