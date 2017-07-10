package com.dahausa.tournamentz.team;

import java.io.Serializable;
import java.util.UUID;

import com.dahausa.tournamentz.team.exceptions.InvalidTeamIdException;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class TeamId implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Getter
	private String id;
	
	TeamId(String id){
		this.id = id;
	}
	
	public static TeamId create() throws InvalidTeamIdException{
		
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString();
		
		return new TeamId(id);
	}

}
