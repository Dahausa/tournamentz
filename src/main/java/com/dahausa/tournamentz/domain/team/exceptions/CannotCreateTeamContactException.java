package com.dahausa.tournamentz.domain.team.exceptions;

import com.dahausa.tournamentz.domain.exceptions.TournamentzDomainException;

public class CannotCreateTeamContactException extends TournamentzDomainException {


	private static final long serialVersionUID = -8982278225806758810L;


	public CannotCreateTeamContactException(String arg0) {
		super(arg0);
	}

	public CannotCreateTeamContactException(Throwable arg0) {
		super(arg0);
	}

	public CannotCreateTeamContactException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CannotCreateTeamContactException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
