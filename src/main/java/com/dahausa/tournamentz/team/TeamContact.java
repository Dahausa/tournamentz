package com.dahausa.tournamentz.team;

import java.util.List;

import com.dahausa.tournamentz.team.exceptions.CannotCreateEmailAddressException;
import com.dahausa.tournamentz.team.exceptions.CannotCreateTeamContactException;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(exclude={"team"})
public class TeamContact {
	
	@Getter
	private String name;
	@Getter
	private EmailAddress mail;
	@Getter
	private List<Team> team;
	
	private TeamContact(String name, EmailAddress emailAddress) {
		this.name = name;
		this.mail = emailAddress;
	}
	
	public static TeamContact create(String name,String emailAddress) throws CannotCreateTeamContactException{
		if(name.isEmpty())
			throw new CannotCreateTeamContactException("Name is empty");
		
		EmailAddress mail;
		try {
			mail = EmailAddress.create(emailAddress);
		} catch (CannotCreateEmailAddressException e) {
			throw new CannotCreateTeamContactException(e);
		}
		
		return new TeamContact(name,mail);
	}
	

}
