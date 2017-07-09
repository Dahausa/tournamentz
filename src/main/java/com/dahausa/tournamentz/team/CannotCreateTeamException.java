package com.dahausa.tournamentz.team;

public class CannotCreateTeamException extends Exception {


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
