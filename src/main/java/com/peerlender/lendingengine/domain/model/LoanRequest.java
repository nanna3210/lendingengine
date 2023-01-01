package com.peerlender.lendingengine.domain.model;

import java.time.Duration;

public class LoanRequest {
    
    
    private final int amount;
//    final because its value cannot be changed through out bean creation lifecycle
    private final User borrower;
    private final Duration paymentTerm;
    private final double interestrate;
    
    
    public LoanRequest ( int amount , User borrower , Duration paymentTerm , double interestrate ) {
        this.amount       = amount;
        this.borrower     = borrower;
        this.paymentTerm  = paymentTerm;
        this.interestrate = interestrate;
    }
    
    
    
}

