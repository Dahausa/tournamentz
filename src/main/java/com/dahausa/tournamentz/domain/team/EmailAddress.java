package com.dahausa.tournamentz.domain.team;

import org.springframework.data.annotation.Id;

import com.dahausa.tournamentz.domain.team.exceptions.CannotCreateEmailAddressException;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode()
public class EmailAddress {
	
	@Getter
	@Id
	private String mailAddress;

	private EmailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public static EmailAddress create(String mailAddress) throws CannotCreateEmailAddressException{
		
		if(mailAddress.contains("@") == false)
			throw new CannotCreateEmailAddressException("Mailaddress needs an '@' to be valid");
		
		return new EmailAddress(mailAddress);
	}
	

}
