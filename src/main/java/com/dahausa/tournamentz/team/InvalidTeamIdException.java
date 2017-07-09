package com.dahausa.tournamentz.team;

public class InvalidTeamIdException extends Exception {


	private static final long serialVersionUID = 5235856588229040843L;

	public InvalidTeamIdException(String message) {
		super(message);
	}

	public InvalidTeamIdException(Throwable cause) {
		super(cause);
	}

	public InvalidTeamIdException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidTeamIdException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
