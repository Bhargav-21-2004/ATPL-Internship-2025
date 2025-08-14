package com.example.registrationsvc.exception;

import java.time.Instant;
import java.util.List;

public class ApiError {
	private final String timestamp= Instant.now().toString();
	private final int status;
	private final List<String> errors;
	public ApiError(int status,List<String> errors) {
		this.status=status;
		this.errors=errors;
		
	}
	public String getTimeStamp() {
		return timestamp;
	}
	public int getStatus() {
		return status;
	}
	public List<String> getErrors(){
		return errors;
	}

}
