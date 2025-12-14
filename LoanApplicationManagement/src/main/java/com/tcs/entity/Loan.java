package com.tcs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String applicantName;
	private double loanAmount;
	private String status;
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Loan(String applicantName, double loanAmount, String status) {
		super();
		this.applicantName = applicantName;
		this.loanAmount = loanAmount;
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Loan [id=" + id + ", applicantName=" + applicantName + ", loanAmount=" + loanAmount + ", status="
				+ status + "]";
	}
	
	
}
