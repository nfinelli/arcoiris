package exceptions;

public class AuthenticationException extends Exception {
	
	private static final long serialVersionUID = 1L;

	String exception;
	
	public AuthenticationException(){
		super();
	}
	
	public AuthenticationException(String e){
		super(e);
		this.exception = e;
	}
	
	public String getException(){
		return this.exception;
	}
}
