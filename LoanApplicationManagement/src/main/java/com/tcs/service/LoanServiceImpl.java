package com.tcs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.Loan;
import com.tcs.exception.DuplicateLoanApplicationException;
import com.tcs.exception.InvalidLoanAmountException;
import com.tcs.exception.LoanNotFoundException;
import com.tcs.repository.LoanRepository;
import com.tcs.util.AppConstant;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	LoanRepository loanrepository;
	
	@Override
	public Loan createLoan(Loan loan)throws InvalidLoanAmountException {
		
		if(loan.getLoanAmount()<0 || loan.getLoanAmount()>5000000)
		
			throw new InvalidLoanAmountException(AppConstant.INVALID_LOAN_AMOUNT_MESSAGE);
		return loanrepository.save(loan);
		
	}

	@Override
	public List<Loan> getAllLoan() {
		// TODO Auto-generated method stub
		return loanrepository.findAll();
	}

	@Override
	public Loan getLoanById(long id) throws LoanNotFoundException {
		//if(!loanrepository.existsById(id))
		
			return loanrepository.findById(id).orElseThrow(()->new LoanNotFoundException(AppConstant.LOAN_ID_INVALID_MESSGAE));
	}

	@Override
	public Loan updateLoan(Loan loan,long id) throws LoanNotFoundException{
		
		Loan loan2 = loanrepository.findById(id).orElseThrow(()->new LoanNotFoundException(AppConstant.LOAN_ID_INVALID_MESSGAE));
		
		loan2.setApplicantName(loan.getApplicantName());
		loan2.setLoanAmount(loan.getLoanAmount());
		loan2.setStatus(loan.getStatus());
		
		return loanrepository.save(loan2);
	}

	@Override
	public List<Loan> findByPending( Loan loan,String status) {
		// TODO Auto-generated method stub
		
		List<Loan> updatedloan = new ArrayList<>();
		if(loan.getStatus().equalsIgnoreCase("pending"))
		loan.setStatus("APPROVED");
		updatedloan.add(loan);
		
		return updatedloan;
	}

}
