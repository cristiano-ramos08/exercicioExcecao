package model.exceptions;

public class DomainException extends RuntimeException {//RuntimeException n�o obriga usar o try e catch, exception sim.

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
