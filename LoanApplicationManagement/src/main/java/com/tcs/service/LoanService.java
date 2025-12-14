package com.tcs.service;

import java.util.List;

import com.tcs.entity.Loan;
import com.tcs.exception.DuplicateLoanApplicationException;
import com.tcs.exception.InvalidLoanAmountException;
import com.tcs.exception.LoanNotFoundException;

public interface LoanService {
	
	public Loan createLoan(Loan loan) throws InvalidLoanAmountException;
	public List<Loan> getAllLoan();
	public Loan getLoanById(long id)throws LoanNotFoundException;
	public Loan updateLoan(Loan loan,long id)throws LoanNotFoundException;
	public List<Loan> findByPending(Loan loan,String status);

}
