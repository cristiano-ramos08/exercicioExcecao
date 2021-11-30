package model.exceptions;

public class DomainException extends RuntimeException {//RuntimeException não obriga usar o try e catch, exception sim.

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
