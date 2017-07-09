package com.dahausa.tournamentz.team;

import lombok.Getter;
import lombok.Setter;

public class Team {
	
	@Getter
	TeamId id;
	@Getter @Setter
	String name;
	@Getter @Setter
	TeamContact contact;
	
	private Team(TeamId id,String name,TeamContact contact){
		this.id = id;
		this.name = name;
		this.contact = contact;
	}
	
	
	public static Team create(String teamName,TeamContact contact) throws CannotCreateTeamException{
		
		if(contact == null)
			throw new CannotCreateTeamException("Team contact is null");
		if(teamName == null)
			throw new CannotCreateTeamException("Team name must not be null");
		if(teamName.isEmpty())
			throw new CannotCreateTeamException("Team name must not be empty");
		
		TeamId id;
		try {
			id = TeamId.create();
		} catch (InvalidTeamIdException e) {
			throw new CannotCreateTeamException(e);
		}
		
		return new Team(id,teamName,contact);
		
	}

}
