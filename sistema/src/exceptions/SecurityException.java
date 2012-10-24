package exceptions;

public class SecurityException extends Exception {

	private static final long serialVersionUID = 1L;

	String exception;
	
	public SecurityException(){
		super();
	}
	
	public SecurityException(String e){
		super(e);
		this.exception = e;
	}
	
	public String getException(){
		return this.exception;
	}
	
}
