package amk.dev.exception;

public class UserNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4153924766836572226L;
	
	String message;
	
	public UserNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	public UserNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
	
	

}
