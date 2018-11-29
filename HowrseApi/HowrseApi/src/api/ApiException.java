package api;

/**
 * An exception for Api stuff
 */
public class ApiException extends Exception{

	private static final long serialVersionUID = 9166822616584744178L;

	public ApiException() {
		
	}
	
	public ApiException(Throwable e) {
		super(e);
	}
	
	public ApiException(String msg) {
		super(msg);
	}
	
	public ApiException(Throwable e, String msg) {
		super(msg);
		initCause(e);
	}
	
}
