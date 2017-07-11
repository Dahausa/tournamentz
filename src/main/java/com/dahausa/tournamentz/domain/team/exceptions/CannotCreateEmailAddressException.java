package com.dahausa.tournamentz.domain.team.exceptions;

import com.dahausa.tournamentz.domain.exceptions.TournamentzDomainException;

public class CannotCreateEmailAddressException extends TournamentzDomainException {


	private static final long serialVersionUID = 1L;

	public CannotCreateEmailAddressException(String message) {
		super(message);
	}

	public CannotCreateEmailAddressException(Throwable cause) {
		super(cause);
	}

	public CannotCreateEmailAddressException(String message, Throwable cause) {
		super(message, cause);
	}

	public CannotCreateEmailAddressException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
