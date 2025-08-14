package com.example.productsvc.exception;

import java.time.Instant;
import java.util.List;

public class ApiError {
	private String timestamp= Instant.now().toString();
	private final int status;
	private final String message;
	private final List<String> errors;
	
	public ApiError(String timestamp,int status,String message,List<String> errors)
	{
		this.timestamp=timestamp;
		this.status=status;
		this.message=message;
		this.errors=errors;
		
	}
	public String getTimeStamp() {
		return timestamp;
	}
	public int getStatus() {
		return status;
	}
	public String message() {
		return message;
	}
	public List<String> getErrors(){
		return errors;
	}




}
