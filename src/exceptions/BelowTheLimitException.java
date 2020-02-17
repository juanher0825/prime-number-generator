package exceptions;

public class BelowTheLimitException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public BelowTheLimitException(String mensaje) {
		super(mensaje);
	}

}
