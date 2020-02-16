package exceptions;

public class OffTheLimitException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public OffTheLimitException(String mensaje) {
		super(mensaje);
	}

}
