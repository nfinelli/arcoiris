package exceptions;

public class ExistsUserException extends Exception {
	
	private static final long serialVersionUID = 1L;

	String exception;
	
	public ExistsUserException(){
		super();
	}
	
	public ExistsUserException(String e){
		super(e);
		this.exception = e;
	}
	
	public String getException(){
		return this.exception;
	}
}