package amk.dev.exception;

import org.springframework.http.HttpStatus;

public class ApiError {

	HttpStatus status;
	String message;
	
	public ApiError() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ApiError(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}


	public HttpStatus getStatus() {
		return status;
	}


	public void setStatus(HttpStatus status) {
		this.status = status;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
