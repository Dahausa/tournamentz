package com.dahausa.tournamentz.domain.team;


import org.springframework.data.annotation.Id;

import com.dahausa.tournamentz.domain.team.exceptions.CannotCreateTeamException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
	
	@Getter @Id
	String name;
	@Getter @Setter
	String label;
	@Getter @Setter
	TeamContact contact;
	
	protected Team(){}
	
	private Team(String name){
		this.name = name;
	}
	
	public static Team create(String teamName) throws CannotCreateTeamException{
		
		if(teamName == null)
			throw new CannotCreateTeamException("Team name must not be null");
		if(teamName.isEmpty())
			throw new CannotCreateTeamException("Team name must not be empty");
		
		return new Team(teamName);
		
	}

}
