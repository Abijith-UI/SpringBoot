package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.entity.Loan;
import com.tcs.exception.InvalidLoanAmountException;
import com.tcs.exception.LoanNotFoundException;
import com.tcs.service.LoanService;

@RestController
@RequestMapping("/api/v1")
public class LoanController {
	
	@Autowired
	LoanService loanservice;
	
	@PostMapping("/loan")
	public Loan createloan(@RequestBody Loan loan) throws InvalidLoanAmountException {
		return loanservice.createLoan(loan);
	}
	
	
	@GetMapping("/loan")
	public List<Loan> getallloan(){
		return loanservice.getAllLoan();
	}
	
	
	@GetMapping("/loan/{id}")
	public Loan getloanbyid(@PathVariable long id) throws LoanNotFoundException{
		return loanservice.getLoanById(id);
	}
	
	
	@PutMapping("/loan/{id}")
	public Loan updatebyid(@RequestBody Loan loan,@PathVariable long id) throws LoanNotFoundException {
		return loanservice.updateLoan(loan,id);
	}
	
	@GetMapping("loan/{status}")
	public List<Loan> getbypending(@RequestBody Loan loan,@PathVariable String status){
		return loanservice.findByPending(loan, status);
	}

}
