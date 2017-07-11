package com.dahausa.tournamentz.domain.exceptions;

/**
 * Base class for all domain exceptions
 * @author dahausa
 *
 */
public class TournamentzDomainException extends Exception {


	private static final long serialVersionUID = 1929720056801493074L;

	public TournamentzDomainException(String arg0) {
		super(arg0);
	}

	public TournamentzDomainException(Throwable arg0) {
		super(arg0);
	}

	public TournamentzDomainException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public TournamentzDomainException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
