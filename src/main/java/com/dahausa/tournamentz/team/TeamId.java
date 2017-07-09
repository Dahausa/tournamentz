package com.dahausa.tournamentz.team;

import java.util.UUID;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
public class TeamId {
	
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
