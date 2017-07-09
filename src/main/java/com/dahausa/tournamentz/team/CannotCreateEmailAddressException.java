package com.dahausa.tournamentz.team;

public class CannotCreateEmailAddressException extends Exception {


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
