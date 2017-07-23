package com.dahausa.tournamentz.team.domain;


import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Id;

import com.dahausa.tournamentz.team.domain.exceptions.CannotCreateTeamException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="TEAMS")
public class Team {
	
	@Getter @Id
	String name;
	@Getter @Setter
	String designation;
	@Getter @Setter
	String contact;
	
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
