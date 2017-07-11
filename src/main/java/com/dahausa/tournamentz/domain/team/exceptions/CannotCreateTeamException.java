package com.dahausa.tournamentz.domain.team.exceptions;

import com.dahausa.tournamentz.domain.exceptions.TournamentzDomainException;

public class CannotCreateTeamException extends TournamentzDomainException {


	private static final long serialVersionUID = 6884319502581376371L;

	public CannotCreateTeamException(String message) {
		super(message);
	}

	public CannotCreateTeamException(Throwable cause) {
		super(cause);
	}

	public CannotCreateTeamException(String message, Throwable cause) {
		super(message, cause);
	}

	public CannotCreateTeamException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
