package com.tcs.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ExceptionHandler(value=LoanNotFoundException.class)
	public ErrorInfo handleLoanNotFound(LoanNotFoundException exception) {
		
		ErrorInfo errorinfo = new ErrorInfo();
		errorinfo.setErrorMessage(exception.getMessage());
		errorinfo.setHttpStatus(HttpStatus.NOT_FOUND);
		errorinfo.setLocalDtaeTime(LocalDateTime.now());
		
		return errorinfo;
		
	}
	
	@ExceptionHandler(value=DuplicateLoanApplicationException.class)
	public String hanldeDuplicateLoan(DuplicateLoanApplicationException exception) {
		return exception.getMessage();
	}
	
	@ExceptionHandler(value=InvalidLoanAmountException.class)
	public String handleInvalidLoanAmount(InvalidLoanAmountException exception) {
		return exception.getMessage();
	}
	

}
