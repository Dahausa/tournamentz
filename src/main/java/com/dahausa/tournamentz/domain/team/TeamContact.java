package com.dahausa.tournamentz.domain.team;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.dahausa.tournamentz.domain.team.exceptions.CannotCreateEmailAddressException;
import com.dahausa.tournamentz.domain.team.exceptions.CannotCreateTeamContactException;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(exclude={"team"})
public class TeamContact {
	
	@Setter @Getter
	private String name;
	
	@Getter
	@Id
	private EmailAddress mail;
	@Getter
	private List<Team> team;
	
	protected TeamContact(){}
	
	private TeamContact(EmailAddress emailAddress) {
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
		
		TeamContact contact = new TeamContact(mail);
		contact.setName(name);
		return contact;
	}
	

}
