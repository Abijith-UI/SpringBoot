package com.tcs.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorInfo {
	
	private String errorMessage;
	private HttpStatus httpStatus;
	private LocalDateTime localDtaeTime;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public LocalDateTime getLocalDtaeTime() {
		return localDtaeTime;
	}
	public void setLocalDtaeTime(LocalDateTime localDtaeTime) {
		this.localDtaeTime = localDtaeTime;
	}
	
	

}
